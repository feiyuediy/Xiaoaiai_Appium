package com.appium.Utils;

import com.appium.Moudle.TestcaseBase;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by admin on 2017/9/6.
 */
public class Assertion {
    public static boolean flag = true;

    public static List<Error> errors = new ArrayList<Error>();

    @Step("检查信息")
    public static void verifyEquals(Object actual, Object expected){
        String info = null;
        try{
            Assert.assertEquals(actual, expected);
            info = "  expect:"+expected+"    actuals:"+actual+"----->ok";
            System.out.println(info);
            wAssertInfo(info);
        }catch(Error e){
            errors.add(e);
            Screenshot.snapshot(TestcaseBase.driver,Assertion.getCurrentDateTime());
            flag = false;
        }
    }
    @Step("检查信息")
    public static void verifyEquals(Object actual, Object expected, String message){
        String info = null;
        try{
            Assert.assertEquals(actual, expected, message);
            info = message+"  expect:"+expected+"    actuals:"+actual+"----->ok";
            System.out.println(info);
            wAssertInfo(info);

        }catch(Error e){
            info = message+ " expect:"+expected+"    actuals:"+actual+"----->fail";
            System.out.println(info);
            wAssertInfo(info);
            Screenshot.snapshot(TestcaseBase.driver,Assertion.getCurrentDateTime());
            errors.add(e);
            flag = false;
        }
    }
    @Attachment(value = "校验",type = "text/plant")
    private static String wAssertInfo(String data){
        return data;
    }

    public static String getCurrentDateTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");//设置日期格式
        return df.format(new Date());
    }
}
