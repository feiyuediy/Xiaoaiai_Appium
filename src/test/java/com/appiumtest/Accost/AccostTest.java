package com.appiumtest.Accost;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.AccostPages.IDphotoPage;
import com.appium.Pages.AccostPages.MoodPage;
import com.appium.Pages.AccostPages.UploadIdphotoPage;
import com.appium.Pages.FindPages.ThemeFeedsPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Pages.NewsPages.ChatNewPage;
import com.appium.Pages.NewsPages.ContactsPage;
import com.appium.Pages.NewsPages.FansListPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.Common;
import com.appium.Utils.DriverCommon;
import com.appium.Utils.Screenshot;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;

/**
 * Created by admin on 2017/9/4.
 */

@Features("搭讪")
@Listeners({com.appium.Listener.AssertionListener.class })

public class AccostTest extends TestcaseBase{
    private IDphotoPage iDphotoPage;
    private  UploadIdphotoPage uploadIdphotoPage;
    private MoodPage moodPage;

    @BeforeClass
    @Parameters({"driverName1", "remoteAddress1","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
    }

    @Test
    @Stories("ID照")
    @Title("点击上传")
    public void test_click_uploas(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18676390321","123456");

        iDphotoPage = new IDphotoPage(driver);
        iDphotoPage.click_upload();

        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.EditIdPhotoActivity",driver.currentActivity());
        driver.pressKeyCode(4);
    }
    @Test
    @Stories("ID照")
    @Title("切换列表类型")
    public void test_change_list(){
        iDphotoPage.changeList("最近注册");
    }

    @Test
    @Stories("ID照")
    @Title("点击id照")
    public void test_click_idPhoto(){
        iDphotoPage.click_idphoto();
        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity());
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("上传id照")
    @Title("上传id照页面点击返回")
    public void test_back_idphotoUpload(){
        uploadIdphotoPage = new UploadIdphotoPage(driver);
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity());
    }

    @Test
    @Stories("上传id照")
    @Title("上传id照页面title")
    public void test_UIcheck_idphotoUpload(){
        iDphotoPage.click_upload();
        String title = uploadIdphotoPage.getTile();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals("ID照上传",title);
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("上传id照")
    @Title("点击更新之后点击取消按钮")
    public void test_dphotoUpload(){
        uploadIdphotoPage.click_uploadIdphoto();
        uploadIdphotoPage.click_cance();
        boolean is = uploadIdphotoPage.is();
        Assertion.verifyEquals(false,is);
    }

    @Test
    @Stories("上传id照")
    @Title("删除id照弹窗检查")
    public void test_deleteIdphoto(){
        uploadIdphotoPage.click_uploadIdphoto();
        uploadIdphotoPage.click_delete();
        String tips = uploadIdphotoPage.getDelectTips();
        Assertion.verifyEquals("您确认要删除已选ID照？",tips);
        uploadIdphotoPage.click_deleteCance();
        boolean is = uploadIdphotoPage.isdelect();
        Assertion.verifyEquals(false,is);
        uploadIdphotoPage.click_uploadIdphoto();
        uploadIdphotoPage.click_delete();
        uploadIdphotoPage.click_deleteSure();
        boolean isExitUploadButton = uploadIdphotoPage.isExitUpload();
        Assertion.verifyEquals(false,isExitUploadButton);
    }


    @Test
    @Stories("上传id照")
    @Title("更新id照")
    public void test_upload() throws InterruptedException {
        uploadIdphotoPage.upload();
        Thread.sleep(5000);
        String tips = uploadIdphotoPage.getIdphotostatiu();
        Assertion.verifyEquals("审核中",tips);
        String text = uploadIdphotoPage.getUploadText();
        Assertion.verifyEquals("审核中",text);
        driver.pressKeyCode(4);
    }


    @Test
    @Stories("心情")
    @Title("点击心情列表中的头像")
    public void test_click_head() {
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoMood();
        moodPage = new MoodPage(driver);
        moodPage.changeScreen("女");
        moodPage.click_head(2);
        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击心情列表中的头像跳转到个人资料");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("心情")
    @Title("发布信息")
    public void test_edit_mood()  {
        String mood = "心情测试test"+Integer.toString((int)(Math.random()*9+1)*100000);
        moodPage.editMood(mood);
        Assertion.verifyEquals("心情："+mood,moodPage.getMyMood(),"检查发布心情是否成功");
    }

    @Test
    @Stories("心情")
    @Title("检查标签")
    public void test_UI_tag()  {
        boolean levilTag = moodPage.getLevilTag();
        boolean sexTag = moodPage.getSexTag();
        boolean device = moodPage.getdeviceTag();
        boolean chang = moodPage.getChaneTag();
        Assertion.verifyEquals(true,levilTag,"检查等级标签存在");
        Assertion.verifyEquals(true,sexTag,"检查性别标签存在");
        Assertion.verifyEquals(true,device,"检查设备标签存在");
        Assertion.verifyEquals(true,chang,"检查魅力值标签存在");
    }

    @Test
    @Stories("心情")
    @Title("心情页面关注")
    public void test_mood_floow(){
        for (int i = 2;i<=6;i++){
            String xpth = "//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout["+Integer.valueOf(i)+"]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]";
            String file = Screenshot.snapshotWithElement(driver,driver.findElement(By.xpath(xpth)));
            System.out.println(file);
            boolean isNoFllow = Common.comparePint(file,"D:\\GitProject\\Xiaoaiai_appium\\Xiaoaiai_Appium\\src\\main\\resources\\png\\noFllow.png",90);
            //判断是否关注了
            if (isNoFllow){
                //没有关注就点击关注
                driver.findElementByXPath(xpth).click();
                moodPage.click_ok();
                //获取那个人的昵称
                String nick = driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout["+Integer.valueOf(i)+"]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]").getText();
                //进入消息页面
                AccostPage accostPage = new AccostPage(driver);
                accostPage.gotoNews();
                //点击联系人进入到联系人页面
                ChatNewPage chatNewPage = new ChatNewPage(driver);
                chatNewPage.click_contacts();
                //点击我的关注进入到关注列表
                ContactsPage contactsPage = new ContactsPage(driver);
                contactsPage.click_myAttountion();
                //取消关注刚才的那个人
                FansListPage fansListPage = new FansListPage(driver);
                fansListPage.cancleAttention(nick);
                break;
            }
        }

    }


    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
