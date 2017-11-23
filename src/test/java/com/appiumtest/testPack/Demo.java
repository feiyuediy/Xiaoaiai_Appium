package com.appiumtest.testPack;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.FindPages.HotPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import com.appium.Utils.ReportUtil;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
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
 * Created by admin on 2017/8/29.
 */

public class Demo extends TestcaseBase{

    @BeforeClass
    @Parameters({"driverName1", "driverName2"})
    public void setup(String driverName1, String driverName2) throws MalformedURLException {
        driver = DriverCommon.getAndroidDriver(driverName1, "http://0.0.0.0:4723/wd/hub");
        driver2 = DriverCommon.getAndroidDriver(driverName2, "http://0.0.0.0:4724/wd/hub");

    }
    @Test
    public void login1() {
        Assertion.verifyEquals(1,2);
    }

    @AfterClass
    public void tear(){
        driver.quit();
        driver2.quit();
    }
}