package com.appium.Utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Command {
    public static void exeCmd(String commandStr) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void clearEvn(){
        String SERVER_APK = "C:\\Users\\admin\\AppData\\Local\\Programs\\appium-desktop\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-driver\\uiautomator2\\appium-uiautomator2-server-debug-androidTest.apk";
        String SERVER_TEST_APK = "C:\\Users\\admin\\AppData\\Local\\Programs\\appium-desktop\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-driver\\uiautomator2\\appium-uiautomator2-server-v0.1.5.apk";
        String ZIP_EXE = "C:\\Users\\admin\\AppData\\Local\\Android\\Sdk\\tools\\zipalign.exe";

        //卸载server和servertest
        String uninstallServer = "adb -s 23663455 uninstall io.appium.uiautomator2.server";
        String uninstallServerTest  = "adb -s 23663455 uninstall io.appium.uiautomator2.server.test";
        exeCmd(uninstallServer);
        exeCmd(uninstallServerTest);

        //李勇zip 优化
        String zipServer = ZIP_EXE + " -c -v 4 " + SERVER_APK;
        String zipServerTest = ZIP_EXE + " -c -v 4 "+ SERVER_TEST_APK;
        exeCmd(zipServer);
        exeCmd(zipServerTest);


        //安装
        String installServer = "adb -s 23663455 install " +SERVER_APK;
        String installServerTest = "adb -s 23663455 install " +SERVER_TEST_APK;;
        exeCmd(installServer);
        exeCmd(installServerTest);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String kill = "adb kill-server";
        Command.exeCmd(kill);
        String commandStr = "adb start-server";
        //String commandStr = "ipconfig";
        Command.exeCmd(commandStr);
    }

}
