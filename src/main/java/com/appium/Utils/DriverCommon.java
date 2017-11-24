package com.appium.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.apache.regexp.RE;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by admin on 2017/9/1.
 */
public class DriverCommon {


    public static void Hand_permission(AppiumDriver appiumDriver){
        int time =1;
        while (time < 5){
            try{
                appiumDriver.findElementById("android:id/button1").click();
                break;
            }catch (Exception e){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                time++;
            }
        }

    }
    public static AndroidDriver getAndroidDriver(String driveName,String remoteAddress,String apkPath)  {
        DesiredCapabilities capabilities;
        capabilities = ReadSetting.getDesiredCapabilities(driveName);
        capabilities.setCapability("app", apkPath);
        try {
            return new AndroidDriver(new URL(remoteAddress), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void tapInMid(AppiumDriver appiumDriver){
        int width = appiumDriver.manage().window().getSize().width;
        int height = appiumDriver.manage().window().getSize().height;
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.tap(height/2,width/2).perform();
    }
    /**
     * 上滑
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToUp(AppiumDriver<WebElement> driver, int during, int num) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        for (int i = 0; i < num; i++) {
            driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
            goSleep(3);
        }
    }

    /**
     * 下拉
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToDown(AppiumDriver<WebElement> driver,int during, int num) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        System.out.println(width);
        System.out.println(height);
        for (int i = 0; i < num; i++) {
            driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
            goSleep(3);
        }
    }

    /**
     * 向左滑动
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToLeft(AppiumDriver<WebElement> driver,int during, int num) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        for (int i = 0; i < num; i++) {
            driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
            goSleep(3);
        }
    }

    /**
     * 向右滑动
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToRight(AppiumDriver<WebElement> driver,int during, int num) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        for (int i = 0; i < num; i++) {
            driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
            goSleep(3);
        }
    }

    /**
     *
     * @param i
     */
    public static void goSleep(int i){
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void swipeElementToElement(AppiumDriver driver,WebElement elementfrom, WebElement elementTo){
        int x = (elementfrom.getLocation().getX()+elementfrom.getSize().getWidth())/2;
        int y = (elementfrom.getLocation().getY()+elementfrom.getSize().getHeight())/2;
        int xto = (elementTo.getLocation().getX()+elementTo.getSize().getWidth())/2;
        int yto = (elementTo.getLocation().getY()+elementTo.getSize().getHeight())/2;
        driver.swipe(x,y,xto,yto,500);
    }
}
