package com.appiumtest.testPack;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.FindPages.HotPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Pages.NewsPages.ChatNewPage;
import com.appium.Pages.NewsPages.ContactsPage;
import com.appium.Pages.NewsPages.FansListPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import com.appium.Utils.ReportUtil;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;


/**
 * Created by admin on 2017/8/29.
 */

public class Demo extends TestcaseBase{

    @BeforeClass
    @Parameters({"driverName1", "driverName2","apkPath"})
    public void setup(String driverName1, String driverName2,String apkPath) throws MalformedURLException {
        driver = DriverCommon.getAndroidDriver(driverName1, "http://0.0.0.0:4723/wd/hub",apkPath);

    }
    @Test
    public void login1() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("8011245","123456");

        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoNews();

        ChatNewPage chatNewPage = new ChatNewPage(driver);
        chatNewPage.click_contacts();

        ContactsPage contactsPage = new ContactsPage(driver);
        contactsPage.click_myAttountion();

        FansListPage fansListPage = new FansListPage(driver);
        fansListPage.cancleAttention("88880000");
    }

    @Test
    public void test2() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("8011245","123456");
        Thread.sleep(5000);
        String xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]";
        driver.findElementByXPath(xpath).click();
        String toast="不能关注自己";
        try {
            final WebDriverWait wait = new WebDriverWait(driver,2);
            Assert.assertNotNull(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@text,'"+ toast + "')]"))));
            System.out.println("找到了toast");
        } catch (Exception e) {
            throw new AssertionError("找不到"+toast);
        }
    }
    @AfterClass
    public void tear(){
        driver.quit();
        driver2.quit();
    }
}