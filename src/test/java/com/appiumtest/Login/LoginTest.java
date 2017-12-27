package com.appiumtest.Login;

import com.appium.Moudle.TestcaseBase;
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

/**
 * Created by admin on 2017/8/31.
 */
@Features("登录")
@Listeners({com.appium.Listener.AssertionListener.class })

public class LoginTest extends TestcaseBase{
    private LoginPage loginPage ;
    private AndroidDriver androidDriver;
    @BeforeClass
    @Stories("初始化")
    @Parameters({"driverName1","remoteAddress1","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath){
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
        androidDriver = (AndroidDriver) driver;
    }

    @Test()
    @Stories(" 登录")
    @Title("错误的密码登录")
    public void test_login_wrong_pwd(){
        loginPage = new LoginPage(driver);
        loginPage.login("18676390321","111111");
        String title = loginPage.getTitle();
        DriverCommon.findToast(driver,"账号或密码错误");
    }


    @Test()
    @Stories("登录")
    @Title("爱爱号登录")
    public void  test_login_aiaiNum() {
        loginPage.setAcc("8011764");
        loginPage.setPWd("123456");
        loginPage.click_login();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(androidDriver.currentActivity());
        Assertion.verifyEquals(".ui.MainActivity", androidDriver.currentActivity());
        loginPage.quitLogin();

    }
    @Test
    @Stories("登录")
    @Title("QQ登录")
    public void test_login_qq(){
        loginPage.qqlogin();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assertion.verifyEquals(".ui.MainActivity", androidDriver.currentActivity());
        loginPage.quitLogin();
    }

    @Test
    @Stories("登录")
    @Title("微信登录")
    public void test_login_weixin(){
        loginPage.weixinLogin();
        System.out.println(androidDriver.currentActivity());
        Assertion.verifyEquals(".ui.MainActivity", androidDriver.currentActivity());
        loginPage.quitLogin();
    }

    @Test
    @Stories("登录")
    @Title("微信登录")
    public void test_login_weibo(){
        loginPage.weiboLogin();
        Assertion.verifyEquals(".ui.MainActivity", androidDriver.currentActivity());
        loginPage.quitLogin();

    }

    @Test()
    @Stories("登录")
    @Title("手机号码登录")
    public void test_login_mobile(){
        loginPage.setAcc("18676390321");
        loginPage.setPWd("123456");
        loginPage.click_login();
        Assertion.verifyEquals(".ui.MainActivity",androidDriver.currentActivity());
    }


    @AfterClass
    public void teardown(){
        DriverCommon.quit(driver);
    }
}
