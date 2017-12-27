package com.appiumtest.Mine;

import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Pages.MinePage.*;
import com.appium.Moudle.TestcaseBase;
import com.appium.Utils.Assertion;
import com.appium.Utils.Common;
import com.appium.Utils.DriverCommon;
import com.appium.Utils.ReportUtil;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;

/**
 * Created by admin on 2017/8/30.
 */
@Features("我的页面")
@Listeners({com.appium.Listener.AssertionListener.class })
public class MineTest extends TestcaseBase {
    private MinePage minePage;
    private AccountInfoPage accountInfoPage;
    private UserInfoPage userInfoPage;

    @BeforeClass
    @Parameters({"driverName1", "remoteAddress1","apkPath"})
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
        loginPage.login("18676390030","123456");

        //点击进入到我的页面
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoMine();
        //进入到自己的资料页
        minePage = new MinePage(driver);
        minePage.goAccountPage();

        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击个人头像跳转到个人资料页面");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击充值中心跳转到充值中心页面")
    @Description("我的-充值中心-充值跳转到充值中心界面")
    public void test_click_rechange(){
        ReportUtil.log("点击充值中心");
        minePage.goRechargePage();
        Assertion.verifyEquals(".ui.RechargeCenterActivity",driver.currentActivity());
        DriverCommon.back(driver);
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
        DriverCommon.back(driver);

    }

    @Test
    @Stories("点击跳转")
    @Title("点击成长中心跳转到成长页面")
    @Description("我的-成长中心-进入到成长中心")
    public void test_click_growup(){
        minePage.goGrowupPage();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.GrowthCenterActivity",driver.currentActivity(),"点击成长中心跳转到成长页面");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击游戏大厅跳转到游戏大厅")
    @Description("我的-游戏大厅")
    public void test_click_gameCaten(){
        minePage.goGamePage();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.GameLobbyActivity",driver.currentActivity(),"点击成长中心跳转到成长页面");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击许愿夺宝跳转到许愿夺宝")
    @Description("我的-许愿夺宝")
    public void test_click_WishPage(){
        minePage.goWishPage();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.IndianMallActivity",driver.currentActivity(),"点击成长中心跳转到成长页面");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击我的玩具跳转到我的玩具页面")
    @Description("我的-我的玩具")
    public void test_click_myToolPage(){
        minePage.goMytool();
        DriverCommon.Hand_permission(driver);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.MyJoyActivity",driver.currentActivity(),"点击成长中心跳转到成长页面");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击设置跳转到设置页面")
    @Description("我的-设置")
    public void test_click_setting(){
        DriverCommon.swipeToUp(driver,1,1);
        minePage.goSettingPage();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.CommonSetActivity",driver.currentActivity(),"点击成长中心跳转到成长页面");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击帮助跳转到帮助页面")
    @Description("我的-帮助")
    public void test_click_help(){
        minePage.goHelp();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.H5Activity",driver.currentActivity(),"点击成长中心跳转到成长页面");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击返回跳转到返回页面")
    @Description("我的-反馈")
    public void test_click_feedback(){
        minePage.goFeedback();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.FeedBackNavigationActivity",driver.currentActivity(),"点击成长中心跳转到成长页面");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("点击跳转")
    @Title("点击返回分享到分享页面")
    @Description("我的-分享")
    public void test_click_share(){

    }

    @Test
    @Stories("点击跳转")
    @Title("点击关于跳转到关于页面")
    @Description("我的-关于")
    public void test_click_about(){
        minePage.goAbuout();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.AboutActivity",driver.currentActivity(),"点击成长中心跳转到成长页面");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("修改资料")
    @Title("修改头像")
    @Description("修改头像")
    public void test_Edit_headImg(){
        //往上滑动
        DriverCommon.swipeToDown(driver,1,1);
        //点击我的头像进入到我的资料页面
        minePage.goAccountPage();
        accountInfoPage = new AccountInfoPage(driver);

        //点击编辑进入到个人资料界面
        accountInfoPage.gotoEditPage();
        userInfoPage = new UserInfoPage(driver);

        //进入到头像修改页面
        userInfoPage.goEditHead();
        HeadEditPage headEditPage = new HeadEditPage(driver);
        headEditPage.add_head(1);
        DriverCommon.Hand_permission(driver);
        DriverCommon.goSleep(1);
        headEditPage.click_save();
        DriverCommon.findToast(driver,"操作成功");

        //删除一个头像保存环境
        DriverCommon.back(driver);
        userInfoPage.goEditHead();
        int size = headEditPage.get_headImgNum();
        headEditPage.delectHeadImg(size);
        headEditPage.click_save();
        DriverCommon.back(driver);
    }

    @Test
    @Stories("修改资料")
    @Title("修改昵称")
    public void test_edite_nickname(){
        String nick = Common.getRandom()+"t";
        userInfoPage.goEditUserNickPage();
        EditNickPage editNickPage = new EditNickPage(driver);
        editNickPage.EditNickName(nick);

        String afternick = userInfoPage.getNickName();
        Assertion.verifyEquals(nick,afternick);
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
        DriverCommon.quit(driver);
    }
}
