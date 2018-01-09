package com.appium.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

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

    public static void quit(AppiumDriver appiumDriver){
        appiumDriver.quit();
        AndroidDriver androidDriver = (AndroidDriver) appiumDriver;



    }
    public static AndroidDriver getAndroidDriver(String driveName,String remoteAddress,String apkPath)  {

        DesiredCapabilities capabilities;
        capabilities = ReadSetting.getDesiredCapabilities(driveName);
        capabilities.setCapability("app", apkPath);
        //如果是6.0.1系统的，先卸载uiautomator2
        if (capabilities.getCapability("platformVersion").toString().equals("6.0.1")){
            //重启adb命令
//            String kill = "adb kill-server";
//            Command.exeCmd(kill);
//            String commandStr = "adb start-server";
//            //String commandStr = "ipconfig";
//            Command.exeCmd(commandStr);

            String uninstallServer = "adb -s 23663455 uninstall io.appium.uiautomator2.server";
            String uninstallServertest = "adb -s 23663455 uninstall io.appium.uiautomator2.server.test";
            Command.exeCmd(uninstallServer);
            Command.exeCmd(uninstallServertest);
        }

        //启动appium服务
//        AppiumServiceBuilder appiumServiceBuilder = new AppiumServiceBuilder();
//        //端口
//        String[] list = remoteAddress.split(":");
//        appiumServiceBuilder.usingPort(Integer.valueOf(list[2].substring(0,4)));
//        appiumServiceBuilder.withIPAddress("127.0.0.1");
//        appiumServiceBuilder.withLogFile(new File("D:\\GitProject\\Xiaoaiai_appium\\Xiaoaiai_Appium\\logs\\appium.log"));
//        AppiumDriverLocalService appiumDriverLocalService = AppiumDriverLocalService.buildService(appiumServiceBuilder);
//        if (!appiumDriverLocalService.isRunning()){
//            System.out.println("appium 没有启动");
//            appiumDriverLocalService.start();
//        }else {
//            System.out.println("appium 启动了");
//        }
//        appiumDriverLocalService.start();

        String[] list = remoteAddress.split(":");
        System.out.println("list[]:"+list);
        System.out.println(list[2].substring(0,4));
        AppiumServer.startServer(Integer.valueOf(list[2].substring(0,4)));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Duration duration=Duration.ofSeconds(1);
            TouchAction action1 = new TouchAction(driver).press(width / 2, height *5 / 6).waitAction(duration).moveTo(width / 2, height  / 4).release();
            action1.perform();
//            driver.swipe(width / 2, height *3 / 4, width / 2, height  / 4, during);
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
        for (int i = 0; i < num; i++) {
            Duration duration=Duration.ofSeconds(1);
            TouchAction action1 = new TouchAction(driver).press(width / 2, height / 4).waitAction(duration).moveTo(width / 2, height * 5 / 6).release();
            action1.perform();
//            driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
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
            Duration duration=Duration.ofSeconds(1);
            TouchAction action1 = new TouchAction(driver).press(width * 3 / 4, height / 2).waitAction(duration).moveTo(width / 4, height / 2).release();
            action1.perform();
//            driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
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
            TouchAction touchAction = new TouchAction(driver);
            touchAction.press(width / 4, height / 2).moveTo(width * 3 / 4, height / 2).release().perform();
//            driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
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

    public static void back(AndroidDriver appiumDriver){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appiumDriver.pressKeyCode(4);
    }


    public static void swipeElementToElement(AppiumDriver driver,WebElement elementfrom, WebElement elementTo){
        int x = (elementfrom.getLocation().getX()+elementfrom.getSize().getWidth())/2;
        int y = (elementfrom.getLocation().getY()+elementfrom.getSize().getHeight())/2;
        int xto = (elementTo.getLocation().getX()+elementTo.getSize().getWidth())/2;
        int yto = (elementTo.getLocation().getY()+elementTo.getSize().getHeight())/2;
        Duration duration=Duration.ofSeconds(1);
        TouchAction action1 = new TouchAction(driver).press(x,y).waitAction(duration).moveTo(xto,yto).release();
        action1.perform();
//        driver.swipe(x,y,xto,yto,500);
    }

    public static void quit(AndroidDriver androidDriver){
        androidDriver.quit();

    }

    //获取toast
    public static void findToast(AndroidDriver androidDriver,String toast){
        try {
            final WebDriverWait wait = new WebDriverWait(androidDriver,5);
            Assert.assertNotNull(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@text,'"+ toast + "')]"))));
            System.out.println("找到了toast:"+toast);
        } catch (Exception e) {
            throw new AssertionError("找不到"+toast);
        }
    }

    //获取element
    public static WebElement findElementById(AndroidDriver androidDriver, String id){
        try{
            final WebDriverWait webDriverWait = new WebDriverWait(androidDriver,5);
            Assert.assertNotNull((webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)))));
            return androidDriver.findElementById(id);
        }catch (Exception e){
            throw new NoSuchElementException("没有找到id："+id);
        }
    }

    //获取element
    public static List<WebElement> findElementsById(AppiumDriver androidDriver, String id){
        try{
            final WebDriverWait webDriverWait = new WebDriverWait(androidDriver,5);
            Assert.assertNotNull((webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)))));
            return androidDriver.findElementsById(id);
        }catch (Exception e){
            throw new NoSuchElementException("没有找到id："+id);
        }
    }
}
