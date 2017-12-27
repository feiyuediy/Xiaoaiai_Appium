package com.appiumtest.News;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Pages.NewsPages.ChatNewPage;
import com.appium.Pages.NewsPages.GroupPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;

/**
 * Created by admin on 2017/9/20.
 */
@Features("消息")
public class GroupTest extends TestcaseBase {
    private GroupPage groupPage;
    private ChatNewPage chatNewPage;
    private AndroidDriver driver;

    @BeforeClass
    @Parameters({"driverName2", "remoteAddress2","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        System.out.println("login setup");
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
    }

    @Stories("群组")
    @Title("点击banner图")
    @Test
    public void test_click_banner(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18676390321","123456");
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoNews();
        chatNewPage = new ChatNewPage(driver);
        chatNewPage.click_group();
        groupPage = new GroupPage(driver);
        groupPage.click_banner();
        String activity = driver.currentActivity();
        DriverCommon.back(driver);
        Assertion.verifyEquals(activity,".ui.H5Activity","点击banner图跳转到配置的h5页面");
    }

    @Stories("群组")
    @Title("点击我的群组")
    @Test
    public void test_click_myGroup(){
        String name = groupPage.get_myFristGroupName();
        String desc = groupPage.get_myFristGroupDesc();
        groupPage.click_myFristGroup();
        String activity = driver.currentActivity();
        DriverCommon.back(driver);
        Assertion.verifyEquals(activity,".ui.ChatActivity","点击我的群组跳转到聊天界面");

    }

    @Stories("群组")
    @Title("点击推荐群组")
    @Test
    public void test_click_recommendGroup(){
        String name = groupPage.get_fristRecommendGroupName();
        String desc = groupPage.get_fristRecommendGroupDesc();
        groupPage.click_fristRecommendGroup();
        String activity = driver.currentActivity();
        DriverCommon.back(driver);
        Assertion.verifyEquals(activity,".ui.GroupInfoActivity","点击点击推荐群组跳转到群资料界面");

    }

    @Stories("群组")
    @Title("点击全部群组")
    @Test
    public void test_click_allGrout(){
        groupPage.click_allGroup();
        String activity = driver.currentActivity();
        DriverCommon.back(driver);
        Assertion.verifyEquals(activity,".ui.GroupCategoryLabelNewActivity","点击全部群组跳转到全部界面");
    }
}
