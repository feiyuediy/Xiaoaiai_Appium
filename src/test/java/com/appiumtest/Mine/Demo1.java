package com.appiumtest.Mine;

import com.appium.Moudle.TestcaseBase;
import com.appium.Utils.Assertion;
import com.appium.Utils.ReportUtil;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by admin on 2017/8/29.
 */
@Features("测试1")
@Listeners({com.appium.Listener.AssertionListener.class})
public class Demo1  {
    @Stories("测试Stories1")
    @Title("测试Tile1")
    @Description("测试description")
    @Test()
    public void login() {
        ReportUtil.log("第一步");

        Assertion.verifyEquals("3", "32", "msg333334444");
//        ReportUtil.screenshot("D:\\javaProject\\AppiumTest\\Screenshot\\2017_08_30_17_18_15.png");
        ReportUtil.log("第二步");
//        ReportUtil.screenshot("D:\\javaProject\\AppiumTest\\Screenshot\\2017_08_30_17_18_15.png");
        ReportUtil.log("第三部");

        Assertion.verifyEquals("32", "32", "msg332");
        ReportUtil.log("第四部");
        Assertion.verifyEquals("32", "31", "msg45");

    }
    @Stories("测试Stories2")
    @Title("测试Tile2")
    @Description("测试description2")
    @Test()
    public void editacc(){
        ReportUtil.log("第0步");
        Assertion.verifyEquals("32","32","msg333334444");
//        ReportUtil.screenshot("D:\\javaProject\\AppiumTest\\Screenshot\\2017_08_30_17_18_15.png");
        ReportUtil.log("第1步");
//        ReportUtil.screenshot("D:\\javaProject\\AppiumTest\\Screenshot\\2017_08_30_17_18_15.png");
        ReportUtil.log("第2部");
        Assertion.verifyEquals("32","32","msg333334444");
        ReportUtil.log("第3部");
        Assertion.verifyEquals("只看女","只看女");
        Assertion.verifyEquals("32","32","msg333334444");


    }

    @Stories("测试Stories3")
    @Title("测试Tile3")
    @Description("测试description3")
    @Test()
    public void secc(){
        ReportUtil.log("第0步");


        Assertion.verifyEquals("1","1","msg333334444");
//        ReportUtil.screenshot("D:\\javaProject\\AppiumTest\\Screenshot\\2017_08_30_17_18_15.png");
        ReportUtil.log("第1步");
//        ReportUtil.screenshot("D:\\javaProject\\AppiumTest\\Screenshot\\2017_08_30_17_18_15.png");
        ReportUtil.log("第2部");
        Assertion.verifyEquals("32","32","msg333334444");
        ReportUtil.log("第3部");
        Assertion.verifyEquals("35","32","msg333334444");
    }
}