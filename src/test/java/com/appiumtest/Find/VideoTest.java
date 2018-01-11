package com.appiumtest.Find;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.FindPages.HotPage;
import com.appium.Pages.FindPages.RecordVideoPage;
import com.appium.Pages.FindPages.UploadVideoPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Utils.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.omg.PortableInterceptor.AdapterNameHelper;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;


@Stories("视频动态")
@Listeners({com.appium.Listener.AssertionListener.class })

public class VideoTest extends TestcaseBase{
    private RecordVideoPage recordVideoPage;
    private HotPage hotPage;
    private UploadVideoPage uploadVideoPage;


//    @BeforeClass
//    public void setup()  {
//        System.out.println("login setup");
//        driver.launchApp();
//    }
    @BeforeClass
    @Parameters({"driverName1", "remoteAddress1","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
    }

    @Stories("录制视频动态")
    @Title("没有录制时退出录制")
    @Test
    public void test_noRecord_colse(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18676390321","123456");
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoFind();
        hotPage = new HotPage(driver);
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();
        recordVideoPage = new RecordVideoPage(driver);
        recordVideoPage.click_colse();
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity(),"没有录制时点击关闭直接返回到主界面");
    }

    @Stories("录制视频动态")
    @Title("已经录制了退出")
    @Test
    public void test_record_close() throws InterruptedException {
        ReportUtil.log("发现右上角的发布按钮，进入到录制视频页面");
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();

        Thread.sleep(4000);//有一个toast。要等这个王八蛋消失了才可以点击录制
        recordVideoPage.click_record();
        Thread.sleep(3000);
        recordVideoPage.click_colse();

        //判断是否存在弹窗
        boolean isDialog = recordVideoPage.isExitDialog();
        Assertion.verifyEquals(true,isDialog,"录制时点击关闭弹出对话框");

        String dialogTitle = recordVideoPage.get_dialog_title();
        System.out.println(dialogTitle);
        Assertion.verifyEquals("您正在录制视频， 是否放弃录制？",dialogTitle,"点击对话框中的取消，关闭对话框");

        recordVideoPage.click_dialog_cancle();
        boolean isDialog1 = recordVideoPage.isExitDialog();
        Assertion.verifyEquals(false,isDialog1,"点击对话框中的取消，关闭对话框");

        recordVideoPage.click_colse();
        recordVideoPage.click_dialog_ok();
        boolean isDialog2 = recordVideoPage.isExitDialog();
        Assertion.verifyEquals(false,isDialog2,"点击对话框中的确定，关闭对话框");
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity(),"点击对话框中的确定,返回到主界面");
    }

    @Stories("录制视频动态")
    @Title("未录制时不显示删除按钮和完成按钮")
    @Test
    public void test_check_deleteAndConnat() throws InterruptedException {
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();

        boolean isDelectExist = recordVideoPage.isDeleteExist();
        boolean isConcatExist = recordVideoPage.isConcatExist();

        Assertion.verifyEquals(false,isConcatExist,"未录制时不显示提交按钮");
        Assertion.verifyEquals(false,isDelectExist,"未录制时不显示删除按钮");

        Thread.sleep(4000);//有一个toast。要等这个王八蛋消失了才可以点击录制
        recordVideoPage.click_record();
        Thread.sleep(3000);
        recordVideoPage.click_record();

        boolean isDelectExist1 = recordVideoPage.isDeleteExist();
        boolean isConcatExist1 = recordVideoPage.isConcatExist();

        Assertion.verifyEquals(true,isConcatExist1,"录制后显示提交按钮");
        Assertion.verifyEquals(true,isDelectExist1,"录制后显示删除按钮");

    }

    @Stories("录制视频动态")
    @Title("删除已录制的视频")
    @Test
    public void test_delete(){
        recordVideoPage.click_delete();
        boolean is = recordVideoPage.isRecord();
        Assertion.verifyEquals(is,false,"点击删除按钮删除已经录制的视频");
    }

    @Stories("录制视频动态")
    @Title("点击录制页面的文件夹")
    @Test
    public void test_click_folder(){
        recordVideoPage.click_open_folder();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.ImageGridActivity",driver.currentActivity(),"点击录制节目的问文件夹按钮，进入到文件选择页面");
        DriverCommon.back(driver);
    }

    @Stories("录制视频动态")
    @Title("选择本地视频")
    @Test
    public void test_local_video(){
        recordVideoPage.selectLocalVideo();
        Assertion.verifyEquals(".shortvideo.ShortVideoUploadActivity",driver.currentActivity(),"进入发布视频页面");
        System.out.println(driver.currentActivity());
    }

    @Stories("录制视频动态")
    @Title("发布本地视频")
    @Test
    public void test_upload_local_video(){
        uploadVideoPage = new UploadVideoPage(driver);
        uploadVideoPage.add_content("test123");
        uploadVideoPage.click_upload();
        boolean isDialog_progressbar = uploadVideoPage.isDialog_progressbarExit();
        Assertion.verifyEquals(true,isDialog_progressbar,"点击上传后弹窗进度条");

        boolean isOkDialog = uploadVideoPage.isOkExit();
        Assertion.verifyEquals(true,isOkDialog,"上传成功后弹窗上传成功");
        String title = uploadVideoPage.get_ok_title();
        Assertion.verifyEquals("上传成功",title,"检查上传成功的弹窗文案：上传成功");
        uploadVideoPage.click_ok();
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity(),"点击我知道了，返回到主页面");
    }

    @Stories("录制视频动态")
    @Title("发布录制的视频")
    @Test
    public void test_upload_video() throws InterruptedException {
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();
        Thread.sleep(4000);//有一个toast。要等这个王八蛋消失了才可以点击录制
        recordVideoPage.click_record();
        Thread.sleep(5000);
        recordVideoPage.click_record();
        Thread.sleep(1000);
        recordVideoPage.click_record();
        Thread.sleep(3000);
        recordVideoPage.click_record();
        recordVideoPage.click_concat();
        uploadVideoPage.add_content("test1235");
        uploadVideoPage.click_upload();

        boolean isDialog_progressbar = uploadVideoPage.isDialog_progressbarExit();
        Assertion.verifyEquals(true,isDialog_progressbar,"点击上传后弹窗进度条");

        String title = uploadVideoPage.get_ok_title();
        Assertion.verifyEquals("上传成功",title,"检查上传成功的弹窗文案：上传成功");
        uploadVideoPage.click_ok();
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity(),"点击我知道了，返回到主页面");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
//        driver.closeApp();
    }
}
