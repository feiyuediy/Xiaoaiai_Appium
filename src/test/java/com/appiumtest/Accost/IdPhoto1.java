package com.appiumtest.Accost;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.IDphotoPage;
import com.appium.Pages.AccostPages.UploadIdphotoPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by admin on 2017/9/4.
 */

@Features("搭讪")
public class IdPhoto1 {
    private IDphotoPage iDphotoPage;
    private  UploadIdphotoPage uploadIdphotoPage;
    private static AndroidDriver driver;
    private static AndroidDriver cuizi;

    @BeforeTest
    @Parameters({"driverName1","driverName2"})
    public void setup(String driverName1,String driverName2) throws MalformedURLException {
        System.out.println(driverName1);
        System.out.println(driverName2);
        driver = DriverCommon.getAndroidDriver(driverName1,"http://0.0.0.0:4723/wd/hub");
        cuizi = DriverCommon.getAndroidDriver(driverName2,"http://0.0.0.0:4724/wd/hub");

    }


    @Test
    @Stories("ID照")
    @Title("点击上传")
    public void test_click_uploas(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18676390321","123456");


        LoginPage loginPageSanxing = new LoginPage(cuizi);
        loginPageSanxing.login("18676390001","123456");

        iDphotoPage = new IDphotoPage(driver);
        iDphotoPage.click_upload();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.EditIdPhotoActivity",driver.currentActivity());
        driver.pressKeyCode(4);
    }
    @Test
    @Stories("ID照")
    @Title("切换列表类型")
    public void test_change_list(){
        iDphotoPage.changeList("最近注册");
    }
    @Test
    @Stories("ID照")
    @Title("点击id照")
    public void test_click_idPhoto(){
        iDphotoPage.click_idphoto();
        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity());
    }

    @Test
    @Stories("上传id照")
    @Title("上传id照页面点击返回")
    public void test_back_idphotoUpload(){
        uploadIdphotoPage = new UploadIdphotoPage(driver);
        uploadIdphotoPage.click_back();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity());
    }

    @Test
    @Stories("上传id照")
    @Title("上传id照页面title")
    public void test_UIcheck_idphotoUpload(){
        iDphotoPage.click_idphoto();
        String title = uploadIdphotoPage.getTile();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals("ID照上传",title);
    }

    @Test
    @Stories("上传id照")
    @Title("点击更新之后点击取消按钮")
    public void test_dphotoUpload(){
        iDphotoPage.click_upload();
        uploadIdphotoPage.click_uploadIdphoto();
        uploadIdphotoPage.click_cance();
        boolean is = uploadIdphotoPage.is();
        Assertion.verifyEquals(false,is);
    }

    @Test
    @Stories("上传id照")
    @Title("删除id照弹窗检查")
    public void test_deleteIdphoto(){
        uploadIdphotoPage.click_uploadIdphoto();
        uploadIdphotoPage.click_delete();
        String tips = uploadIdphotoPage.getDelectTips();
        Assertion.verifyEquals("您确认要删除已选ID照？",tips);
        uploadIdphotoPage.click_deleteCance();
        boolean is = uploadIdphotoPage.isdelect();
        Assertion.verifyEquals(false,is);
        uploadIdphotoPage.click_uploadIdphoto();
        uploadIdphotoPage.click_delete();
        uploadIdphotoPage.click_deleteSure();
        boolean isExitUploadButton = uploadIdphotoPage.isExitUpload();
        Assertion.verifyEquals(false,isExitUploadButton);
    }


    @Test
    @Stories("上传id照")
    @Title("更新id照")
    public void test_upload() throws InterruptedException {
        uploadIdphotoPage.upload();
        Thread.sleep(5000);
        String tips = uploadIdphotoPage.getIdphotostatiu();
        Assertion.verifyEquals("审核中",tips);
        String text = uploadIdphotoPage.getUploadText();
        Assertion.verifyEquals("审核中",text);
        driver.pressKeyCode(4);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        cuizi.quit();
    }
}
