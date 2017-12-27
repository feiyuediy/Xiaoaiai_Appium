package com.appium.Utils;

import org.apache.commons.exec.*;

import java.io.IOException;

public class AppiumServer {

    public static String APPIUMSERVERSTART = "C:\\Users\\admin\\AppData\\Roaming\\npm\\appium.cmd";
    public static Executor executor;
    public static void startServer(int port) {
        // RuntimeExec appiumObj = new RuntimeExec();
        // appiumObj.excuteCMD(APPIUMSERVERSTART);
        DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
        CommandLine commandLine = CommandLine.parse(APPIUMSERVERSTART+" -a 127.0.0.1 -p "+String.valueOf(port)+ " --log-level error --log D:\\GitProject\\Xiaoaiai_appium\\Xiaoaiai_Appium\\logs\\appium.log");
        ExecuteWatchdog dog = new ExecuteWatchdog(60 * 1000);
        executor = new DefaultExecutor();
        executor.setExitValue(1);
        executor.setWatchdog(dog);
        try {
            executor.execute(commandLine, resultHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            resultHandler.waitFor(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Appium server start");
    }

    public void closeAppium(){
        Command.exeCmd("cmd /c echo off & FOR /F \\\"usebackq tokens=5\\\" %a in\"\n" +
                "                + \" (`netstat -nao ^| findstr /R /C:\\\"\" + appiumServicePort + \"\\\"`) do (FOR /F \\\"usebackq\\\" %b in\"\n" +
                "                + \" (`TASKLIST /FI \\\"PID eq %a\\\" ^| findstr /I node.exe`) do taskkill /F /PID %a)\"");
    }

}
