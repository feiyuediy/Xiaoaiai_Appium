package com.appiumtest.Find;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.FindPages.HotPage;
import com.appium.Pages.FindPages.ThemeFeedsPage;
import com.appium.Pages.FindPages.UploadFeedPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;
import java.util.Arrays;

/**
 * Created by admin on 2017/9/8.
 */

@Features("发现")
@Listeners({com.appium.Listener.AssertionListener.class })

public class UploadFeedTest extends TestcaseBase {
    private UploadFeedPage uploadFeedPage;
    private HotPage hotPage;


//    @BeforeClass
//    public void setup() {
//        driver.launchApp();
//
//    }
    @BeforeClass
    @Parameters({"driverName1", "remoteAddress1","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
    }
    @Stories("发布图文动态")
    @Title("页面检查")
    @Test
    public void test_UI_check(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18676390321","123456");
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoFind();
        hotPage = new HotPage(driver);
        hotPage.click_publsh();
        hotPage.click_publish_text();

        uploadFeedPage = new UploadFeedPage(driver);
        String title = uploadFeedPage.getTitle();
        Assertion.verifyEquals("发布动态",title,"检查标题:发布动态");
        String defu_text = uploadFeedPage.get_et_news();
        Assertion.verifyEquals("添加文字",defu_text,"默认文字：添加文字");
        String tips = uploadFeedPage.get_tips();
        Assertion.verifyEquals("请发布文明内容，共同维护小爱爱社区和谐氛围。",tips,"默认文字：添加文字");
    }

    @Stories("发布图文动态")
    @Title("点击返回按钮")
    @Test
    public void test_cilck_back(){
        uploadFeedPage.click_back();
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity(),"点击返回按钮，返回到主界面");
        hotPage.click_publsh();
        hotPage.click_publish_text();
    }

    @Stories("发布图文动态")
    @Title("无内容点击发布按钮")
    @Test
    public void test_noNews_click_upload(){
        uploadFeedPage.click_upload();
        boolean isExitDialog = uploadFeedPage.isExitDialog();
        Assertion.verifyEquals(true,isExitDialog,"无内容点击发布弹窗不能为空的对话框");
        String title = uploadFeedPage.get_dialog_txt();
        Assertion.verifyEquals("不能发表空的动态！",title,"检查提示框中的文字");
        uploadFeedPage.click_dialog_ok();
        boolean isExitDialog1 = uploadFeedPage.isExitDialog();
        Assertion.verifyEquals(false,isExitDialog1,"点击对话框中的我知道了，对话框消失");
    }

    @Stories("发布图文动态")
    @Title("没有选择话题标签发布")
    @Test
    public void test_noTopic_upload(){
        uploadFeedPage.editNews("dddddddd");
        uploadFeedPage.click_upload();
        boolean isExitDialog = uploadFeedPage.isExitDialog();
        Assertion.verifyEquals(true,isExitDialog,"没有选择话题发布弹出提示框");
        String title = uploadFeedPage.get_dialog_txt();
        Assertion.verifyEquals("还没有选择话题呢",title,"检查提示框中的文字");
        uploadFeedPage.click_dialog_ok();
        boolean isExitDialog1 = uploadFeedPage.isExitDialog();
        Assertion.verifyEquals(false,isExitDialog1,"点击对话框中的我知道了，对话框消失");
        DriverCommon.back(driver);
    }

    @Stories("发布图文动态")
    @Title("发布包含文字和图片的动态")
    @Test
    public void test_upload_txtAndPic() throws InterruptedException {
        //进入到发布图文动态的页面
        hotPage.click_publsh();
        hotPage.click_publish_text();

        String txt = "大师傅234234*（*&aaa"+Integer.toString((int)((Math.random()*9+1)*10000));
        uploadFeedPage.editNews(txt);

        String conont_length = uploadFeedPage.get_content_length();
        Assertion.verifyEquals("21/200字",conont_length,"输入文字后检查文字长度tips");

        uploadFeedPage.select_photo_pic(3);
        String pic_length = uploadFeedPage.get_pic_length();
        Assertion.verifyEquals("3/9",pic_length,"上传图片后检查图片长度tips");

        uploadFeedPage.select_topicByInt(1);//预发布环境只有三个topic
        String topicText = uploadFeedPage.get_topicTextByInt(1);

        uploadFeedPage.click_upload();
        boolean isExitProgressbar = uploadFeedPage.isExitprogressbar();
        Assertion.verifyEquals(true,isExitProgressbar,"发送中的进度条是否存在");
        Thread.sleep(20000);
        Assertion.verifyEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"发布成功后调整到该话题动态页面");

        //检查调整后的话题页面是否正确
        ThemeFeedsPage themeFeedsPage = new ThemeFeedsPage(driver);
        String title = themeFeedsPage.getTitle();
        System.out.println(topicText);
        System.out.println(topicText.split("#").length);
        System.out.println(topicText.split("#")[1]);
        Assertion.verifyEquals(topicText.split("#")[1],title,"检查跳转后页面的主题的title");
        String content = themeFeedsPage.getContent();
        Assertion.verifyEquals(txt,content,"检查跳转后页面的主题的内容");

        //上传刚才发布的动态,清理环境
        themeFeedsPage.delectFeed();
        Assertion.verifyEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"由主题话题页面点击返回，返回到主页面");
        DriverCommon.back(driver);
    }

    @Stories("发布图文动态")
    @Title("发布包含文字")
    @Test
    public void test_upload_txt() throws InterruptedException {
        //进入到发布图文动态的页面
        hotPage.click_publsh();
        hotPage.click_publish_text();

        String txt = "大傻逼，。*&……aaa"+Integer.toString((int)((Math.random()*9+1)*10000));
        uploadFeedPage.editNews(txt);

        uploadFeedPage.select_topicByInt(1);//预发布环境只有三个topic
        String topicText = uploadFeedPage.get_topicTextByInt(1);
        uploadFeedPage.click_upload();
        Thread.sleep(4000);
        Assertion.verifyEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"发布成功后调整到该话题动态页面");

        //检查调整后的话题页面是否正确
        ThemeFeedsPage themeFeedsPage = new ThemeFeedsPage(driver);
        String title = themeFeedsPage.getTitle();
        Assertion.verifyEquals(topicText.split("#")[1],title,"检查跳转后页面的主题的title");
        String content = themeFeedsPage.getContent();
        Assertion.verifyEquals(txt,content,"检查跳转后页面的主题的内容");

        //上传刚才发布的动态,清理环境
        themeFeedsPage.delectFeed();

        DriverCommon.back(driver);//
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity(),"由主题话题页面点击返回，返回到主页面");
    }

    @Stories("发布图文动态")
    @Title("匿名发布")
    @Test
    public void test_upload_anonymity() throws InterruptedException {
        //进入到发布图文动态的页面
        hotPage.click_publsh();
        hotPage.click_publish_text();

        uploadFeedPage.select_photo_pic(2);
        uploadFeedPage.click_anonymity();

        uploadFeedPage.select_topicByInt(1);//预发布环境只有三个topic
        String topicText = uploadFeedPage.get_topicTextByInt(1);

        uploadFeedPage.click_upload();

        boolean isExitProgressbar = uploadFeedPage.isExitprogressbar();
        Assertion.verifyEquals(true,isExitProgressbar,"发送中的进度条是否存在");
        Thread.sleep(20000);
        Assertion.verifyEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"发布成功后调整到该话题动态页面");

        //检查调整后的话题页面是否正确
        ThemeFeedsPage themeFeedsPage = new ThemeFeedsPage(driver);
        String title = themeFeedsPage.getTitle();
        Assertion.verifyEquals(topicText.split("#")[1],title,"检查跳转后页面的主题的title");
        String name = themeFeedsPage.getFristFeedNick();
        String[] namelist = {"雅致的倪明初_吴彦祖","雅致的迪丽热巴"};
        System.out.println("name:"+name);
        Assertion.verifyEquals(Arrays.asList(namelist).contains(name),true,"判断匿名的名称是否符合");

        //上传刚才发布的动态,清理环境
        themeFeedsPage.delectFeed();

        DriverCommon.back(driver);//
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity(),"由主题话题页面点击返回，返回到主页面");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
//        driver.closeApp();
            }
}
