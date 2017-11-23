package com.appium.Utils;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by admin on 2017/8/30.
 */
public class ReportUtil {

    @Step
    public static String log(String msg){
        System.out.println(msg);
        return msg;
    }
    @Attachment(value = "截图", type = "image/png")
    public static byte[] screenshot(String filePaht) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        byte[] data = null;
        // 读取图片字节数组
        try {
            in = new FileInputStream(filePaht);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 返回Base64编码过的字节数组字符串
        return data;
    }
}
