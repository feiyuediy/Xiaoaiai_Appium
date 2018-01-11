package com.appiumtest.Find;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.FindPages.HotPage;
import com.appium.Pages.FindPages.VideoFeedDetailPage;
import com.appium.Pages.FindPages.VideoFeedPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.Common;
import com.appium.Utils.DriverCommon;
import com.appium.Utils.Screenshot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2017/9/13.
 */
@Features("发现")
public class VideoFeedTest {
    private VideoFeedPage videoFeedPage;
    private VideoFeedDetailPage videoFeedDetailPage;


    private AppiumDriver appiumDriver;
    private AndroidDriver driver;


//    @BeforeClass
//    public void setup() {
//        System.out.println("login setup");
//        driver.launchApp();
//        driver = (AndroidDriver) appiumDriver;
//    }

    @BeforeClass
    @Parameters({"driverName1", "remoteAddress1","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
    }

    @Stories("视频")
    @Title("点击视频动态")
    @Test
    public void test_clickVideoFeed(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18676390321","123456");
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoFind();

        HotPage hotPage = new HotPage(driver);
        hotPage.click_video();
        videoFeedPage= new VideoFeedPage(driver);
        videoFeedPage.cilck_videoFeed(3);
        videoFeedDetailPage = new VideoFeedDetailPage(driver);
        Assertion.verifyEquals(".ui.VideoFeedDetailActivity",driver.currentActivity(),"点击视频动态跳转到视频动态详情");
    }
    @Stories("视频")
    @Title("判断视频是否知道动")
    @Test
    public void test_video_move() throws InterruptedException {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        String file = Screenshot.snapshot(driver,dateString);
        Thread.sleep(3000);
        Date currentTime1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString1 = formatter1.format(currentTime1);
        String file1 = Screenshot.snapshot(driver,dateString1);
        Assertion.verifyEquals(false,Common.comparePint(file,file1,90),"对比3s后的画面是否一致");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
//        driver.closeApp();
    }
}
