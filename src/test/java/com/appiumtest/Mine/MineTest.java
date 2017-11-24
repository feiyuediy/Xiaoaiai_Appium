package com.appiumtest.Mine;

import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Pages.MinePage.AccountInfoPage;
import com.appium.Pages.MinePage.MinePage;
import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.MinePage.UserInfoPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import com.appium.Utils.ReportUtil;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;

/**
 * Created by admin on 2017/8/30.
 */
@Features("我的页面")
public class MineTest extends TestcaseBase {
    private MinePage minePage;
    private AccountInfoPage accountInfoPage;
    private UserInfoPage userInfoPage;
    @BeforeClass
    @Parameters({"driverName2", "remoteAddress2","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        System.out.println("login setup");
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击头像跳转到个人资料页面")
    @Description("在我的界面，点击头像进入到自己的资料页面")
    public void test_click_head(){
        //登录账号
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18676390004","123456");

        //点击进入到我的页面
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoMine();
        //进入到自己的资料页
        minePage = new MinePage(driver);
        minePage.goAccountPage();

        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击个人头像跳转到个人资料页面");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击充值中心跳转到充值中心页面")
    @Description("我的-充值中心-充值跳转到充值中心界面")
    public void test_click_rechange(){
        ReportUtil.log("点击充值中心");
        minePage.goRechargePage();
        Assertion.verifyEquals(".ui.RechargeCenterActivity",driver.currentActivity());
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击会员中心跳转到会员中心页面")
    @Description("我的-会员中心-跳转到会员中心")
    public void test_click_vip(){
        ReportUtil.log("点击会员中心");
        minePage.goVipPage();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.ServiceCenterNewActivity",driver.currentActivity(),"点击会员中心跳转到会员中心页面");
        driver.pressKeyCode(4);

    }

    @Test
    @Stories("点击跳转")
    @Title("点击成长中心跳转到成长页面")
    @Description("我的-成长中心-进入到成长中心")
    public void test_click_growup(){
        minePage.goGrowupPage();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.GrowthCenterActivity",driver.currentActivity(),"点击成长中心跳转到成长页面");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("修改资料")
    @Title("修改昵称")
    @Description("我-点击头像-编辑:编辑界面进行修改昵称")
    public void test_Edit_nickName(){
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoMine();
        minePage = new MinePage(driver);
        minePage.goAccountPage();
        accountInfoPage = new AccountInfoPage(driver);
        accountInfoPage.gotoEditPage();
        userInfoPage = new UserInfoPage(driver);
        userInfoPage.EditUserNickName("23424234");
    }

    @Test
    @Stories("修改资料")
    @Title("修改头像")
    public void test_edite_head(){
        System.out.println("修改头像");
    }

    @Test
    @Stories("修改资料")
    @Title("修改ID照")
    public void test_edite_idPhoto(){
        System.out.println("修改ID照");
    }

    @Test
    @Stories("修改资料")
    @Title("修改地区")
    public void test_edite_city(){
        System.out.println("修改地区");
    }

    @AfterClass
    public void tear(){
        driver.quit();
    }
}
