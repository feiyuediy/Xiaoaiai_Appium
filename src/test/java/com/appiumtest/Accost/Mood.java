package com.appiumtest.Accost;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.AccostPages.MoodPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchContextException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;

/**
 * Created by admin on 2017/9/4.
 */
@Features("搭讪")
public class Mood  {
    private MoodPage moodPage;
    private AndroidDriver driver;

    @BeforeClass
    @Parameters({"driverName2", "remoteAddress2"})
    public void setup(String driverName2, String remoteAddress2) throws MalformedURLException {
        System.out.println("AccostTest setup");
        driver = DriverCommon.getAndroidDriver(driverName2, remoteAddress2);
    }
    @Test
    @Stories("心情")
    @Title("默认刷选项")
    public void test_defu_screen(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("18676390321","123456");
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoMood();
        moodPage = new MoodPage(driver);
        String defu_screen = moodPage.getScreenText();
        Assertion.verifyEquals("只看女",defu_screen,"查看默认的选项");
    }

    @Test
    @Stories("心情")
    @Title("切换刷选条件")
    public void test_change_screen(){
        moodPage.changeScreen("全部");
        String text = moodPage.getScreenText();
        Assertion.verifyEquals("全部",text);
        moodPage.changeScreen("只看男");
        Assertion.verifyEquals("只看男",moodPage.getScreenText());
        moodPage.changeScreen("只看女");
        Assertion.verifyEquals("只看女",moodPage.getScreenText());
        Assertion.verifyEquals(1,2);
    }

    @Test
    @Stories("心情")
    @Title("点击心情列表中的头像")
    public void test_click_head() {
        moodPage.click_head(2);
        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击心情列表中的头像跳转到个人资料");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("心情")
    @Title("发布信息")
    public void test_edit_mood()  {
        String mood = "心情测试test"+Integer.toString((int)(Math.random()*9+1)*100000);
        moodPage.editMood(mood);
        Assertion.verifyEquals("心情："+mood,moodPage.getMyMood(),"检查发布心情是否成功");
    }

    @Test
    @Stories("心情")
    @Title("检查标签")
    public void test_UI_tag()  {
        boolean levilTag = moodPage.getLevilTag();
        boolean sexTag = moodPage.getSexTag();
        boolean device = moodPage.getdeviceTag();
        boolean chang = moodPage.getChaneTag();
        Assertion.verifyEquals(true,levilTag,"检查等级标签存在");
        Assertion.verifyEquals(true,sexTag,"检查性别标签存在");
        Assertion.verifyEquals(true,device,"检查设备标签存在");
        Assertion.verifyEquals(true,chang,"检查魅力值标签存在");
    }
}
