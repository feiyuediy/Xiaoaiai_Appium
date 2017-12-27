package com.appium.Utils;

import com.google.gson.JsonObject;
import com.jayway.jsonpath.JsonPath;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;

public class ReadSetting {
    private static File file = new File("src\\main\\resources\\setting.json");
    public static void main(String args[]) throws IOException {
    }


    //读取apk的位置
    @Parameters("apkPath")
    public static String getApkPath(String apkPath){
        return apkPath;
    }

    //读取配置文件中的设备信息
    public static DesiredCapabilities getDesiredCapabilities(String driveName){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        try {
            desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME,"");
            desiredCapabilities.setCapability("platformName",JsonPath.read(file,"$."+driveName+".platformName").toString());
            desiredCapabilities.setCapability("deviceName",JsonPath.read(file,"$."+driveName+".deviceName").toString());
            desiredCapabilities.setCapability("platformVersion",JsonPath.read(file,"$."+driveName+".platformVersion").toString());
            desiredCapabilities.setCapability("appPackage",JsonPath.read(file,"$."+driveName+".appPackage").toString());
            desiredCapabilities.setCapability("unicodeKeyboard",JsonPath.read(file,"$."+driveName+".unicodeKeyboard").toString());
            desiredCapabilities.setCapability("appActivity",JsonPath.read(file,"$."+driveName+".appActivity").toString());
            desiredCapabilities.setCapability("automationName",JsonPath.read(file,"$."+driveName+".automationName").toString());

            desiredCapabilities.setCapability("autoAcceptAlerts",JsonPath.read(file,"$."+driveName+".autoAcceptAlerts").toString());
            desiredCapabilities.setCapability("newCommandTimeout",JsonPath.read(file,"$."+driveName+".newCommandTimeout").toString());


        } catch (IOException e) {
            e.printStackTrace();
        }
        return desiredCapabilities;
    }
}
