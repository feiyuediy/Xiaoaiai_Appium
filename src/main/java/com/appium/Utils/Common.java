package com.appium.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.io.*;



/**
 * Created by admin on 2017/8/31.
 */
public class Common {

    public static void main(String args[]) throws IOException {
        getAndroidVersion();
//        ImageUtils.cutPNG("D:\\javaProject\\AppiumTest\\Screenshot\\20170906_144342.png",
//                "E:\\Temp\\339.png", 372,1150,684,1240);
//        comparePint("C:\\Users\\admin\\Desktop\\QQ图片20170913153359.jpg","C:\\Users\\admin\\Desktop\\QQ图片20170913153353.jpg",90);
    }

    public static String getRandmin(){
        long r1 = System.currentTimeMillis();
        return String.valueOf(r1);
    }

    public static String exeCmd(String commandStr) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static String getAndroidVersion(){
        String version;
        String adb = "adb shell getprop ro.build.version.release";

        return exeCmd(adb);
    }
    public static boolean comparePint(String file1, String file2, float similarityDegree){
        FingerPrint fp1 = null;
        FingerPrint fp2 = null;
        try {
            fp1 = new FingerPrint(ImageIO.read(new File(file1)));
            fp2 = new FingerPrint(ImageIO.read(new File(file2)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("相似度="+fp1.compare(fp2)*100+"%%");
        if (fp1.compare(fp2)*100>similarityDegree){
            return true;
        }else {
            return false;
        }
    }
}