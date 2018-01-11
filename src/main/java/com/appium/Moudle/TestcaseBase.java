package com.appium.Moudle;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.*;

import java.net.MalformedURLException;


/**
 * Created by admin on 2017/8/29.
 */
public class TestcaseBase {
    public static AndroidDriver driver;
    public  static AndroidDriver driver2;

    @BeforeSuite
    @Parameters({"driverName1","driverName2", "remoteAddress1","remoteAddress2","apkPath"})
    public void suite_setup(String driverName1, String driverName2 ,String remoteAddress1, String remoteAddress2,String apkPath) throws MalformedURLException {
//        driver = DriverCommon.getAndroidDriver(driverName1,remoteAddress1,apkPath);
//        driver2 = DriverCommon.getAndroidDriver(driverName2,remoteAddress2,apkPath);
    }


    @AfterSuite
    public void suite_teardown(){
        driver.quit();
        driver2.quit();
    }
}
