package com.appium.Utils;

import com.google.gson.JsonObject;
import com.jayway.jsonpath.JsonPath;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class ReadSetting {
    private static File file = new File("D:\\javaProject\\AppiumTest\\src\\main\\resources\\setting.json");
    public static void main(String args[]){
        getDesiredCapabilities("");
    }


    //读取apk的位置
    public static String getApkPath(){
        try {
            return JsonPath.read(file,"$.appPath");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    //读取配置文件中的设备信息
    public static DesiredCapabilities getDesiredCapabilities(String driveName){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        try {
            desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME,"");
            desiredCapabilities.setCapability("platformName",JsonPath.read(file,"$."+driveName+".platformName"));
            desiredCapabilities.setCapability("deviceName",JsonPath.read(file,"$."+driveName+".deviceName"));
            desiredCapabilities.setCapability("platformVersion",JsonPath.read(file,"$."+driveName+".platformVersion"));
            desiredCapabilities.setCapability("appPackage",JsonPath.read(file,"$."+driveName+".appPackage"));
            desiredCapabilities.setCapability("unicodeKeyboard",JsonPath.read(file,"$."+driveName+".unicodeKeyboard"));
            desiredCapabilities.setCapability("appActivity",JsonPath.read(file,"$."+driveName+".appActivity"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return desiredCapabilities;
    }
}
