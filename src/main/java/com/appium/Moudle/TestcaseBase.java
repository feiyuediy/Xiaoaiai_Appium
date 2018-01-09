package com.appium.Moudle;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.*;


/**
 * Created by admin on 2017/8/29.
 */
public class TestcaseBase {
    public static AndroidDriver driver;
    public static  AndroidDriver driver2;

    @Test
    public void test_1(){
        System.out.println("32333");
    }
}
