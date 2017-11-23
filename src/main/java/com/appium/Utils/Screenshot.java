package com.appium.Utils;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.apache.regexp.RE;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2017/8/30.
 */
public class Screenshot {

    public static String snapshotWithElement(AppiumDriver driver, WebElement element){
        String currentPath = System.getProperty("user.dir");
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        snapshot(driver,date);//截图名称应该是data.png
        //有时移动的屏幕的时候，会有定位不准确的情况

        System.out.println("开始定位元素了，屏幕是否还在动");
        Point location =  element.getLocation();
        System.out.println("location:"+location.toString());
        Dimension size = element.getSize();
        System.out.println("Dimension:"+size.toString());
        int[] x = {location.getX(),location.getY(),size.getWidth(),size.getHeight()};
        for (int a=0;a<x.length;a++){
            if (x[a]<0){
                x[a] = 0;
            }
        }
        try {
            ImageUtils.cutPNG(currentPath+"\\Screenshot\\"+date+".png",currentPath+"\\Temp\\"+date+".png",x[0],x[1],x[2],x[3]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currentPath+"\\Temp\\"+date+".png";
    }
    public static String snapshot(AppiumDriver drivername, String filename) {
        String currentPath = System.getProperty("user.dir"); // get current work
        File scrFile = drivername.getScreenshotAs(OutputType.FILE);

        try {
            System.out.println("save snapshot path is:" + currentPath + "\\"
                    + filename);
            FileUtils
                    .copyFile(scrFile, new File(currentPath + "\\Screenshot\\" + filename+".png"));
            ReportUtil.screenshot(currentPath + "\\Screenshot\\" + filename+".png");

        } catch (IOException e) {
            System.out.println("Can't save screenshot");
            e.printStackTrace();
        } finally {
            System.out.println("screen shot finished, it's in " + currentPath + "\\Screenshot\\" + filename+".png");
        }
        return currentPath + "\\Screenshot\\" + filename+".png";
    }
}
