package com.appiumtest.Mine;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.MinePage.AccountInfoPage;
import com.appium.Pages.MinePage.MinePage;
import com.appium.Pages.MinePage.UserInfoPage;
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
 * Created by admin on 2017/8/30.
 */
@Features("修改资料")
public class EditInfo  {
    private AccountInfoPage accountInfoPage;
    private MinePage minePage;
    private UserInfoPage userInfoPage;
    private AndroidDriver driver;

    @BeforeClass
    @Parameters({"driverName2", "remoteAddress2"})
    public void setup(String driverName2, String remoteAddress2) throws MalformedURLException {
        System.out.println("AccostTest setup");
        driver = DriverCommon.getAndroidDriver(driverName2, remoteAddress2);
    }
    @Test
    @Stories("修改资料")
    @Title("修改昵称")
    public void test_Edit_nickName(){
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoMine();
        minePage = new MinePage(driver);
        minePage.goAccountPage();
        accountInfoPage = new AccountInfoPage(driver);
        accountInfoPage.gotoEditPage();
        userInfoPage = new UserInfoPage(driver);
        userInfoPage.EditUserNickName("23424234");
        Assertion.verifyEquals(1,2);
        Assertion.verifyEquals(2,1);
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
}
