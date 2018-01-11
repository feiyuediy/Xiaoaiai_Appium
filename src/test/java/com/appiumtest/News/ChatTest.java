package com.appiumtest.News;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.NewsPages.ChatNewPage;
import com.appium.Pages.NewsPages.ChatPage;
import com.appium.Pages.NewsPages.GroupPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2017/9/20.
 */
@Features("消息")
public class ChatTest extends TestcaseBase {
    private ChatPage chatPage;

//    @BeforeClass
//    @Parameters({"driverName2", "remoteAddress2","apkPath"})
//    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
//        System.out.println("login setup");
//        driver.launchApp();
//    }
    @BeforeClass
    @Parameters({"driverName1", "remoteAddress1","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
    }
    @Stories("聊天界面")
    @Title("点击返回按钮")
    @Test
    public void test_click_back(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("18676390321","123456");
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoNews();
        ChatNewPage chatNewPage = new ChatNewPage(driver);
        chatNewPage.click_group();
        GroupPage groupPage = new GroupPage(driver);
        groupPage.click_myFristGroup();

        chatPage = new ChatPage(driver);

        chatPage.click_back();
        System.out.println(driver);

        groupPage.click_myFristGroup();
    }

    @Stories("聊天界面")
    @Title("点击资料")
    @Test
    public void test_click_ziliao(){
        chatPage.click_ziliao();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(driver.currentActivity(),".ui.GroupInfoActivity","点击资料跳转到群资料");
        DriverCommon.back(driver);
    }

    @Stories("聊天界面")
    @Title("发送文本")
    @Test
    public void test_send_txt(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        String txt = df.format(new Date())+"哈哈";
        chatPage.send_txt(txt);

        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送文本成功");
    }

    @Stories("聊天界面")
    @Title("发送语音")
    @Test
    public void test_send_voice() throws InterruptedException {

        chatPage.send_voice(3);
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送语音成功");
    }

    @Stories("聊天界面")
    @Title("发送表情")
    @Test
    public void test_send_emoj() throws InterruptedException {

        chatPage.send_emoj();
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送表情成功");

    }

    @Stories("聊天界面")
    @Title("发送图片")
    @Test
    public void test_send_pic() throws InterruptedException {
        chatPage.send_pic();
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送图片成功");
    }

    @Stories("聊天界面")
    @Title("发送阅后即焚")
    @Test
    public void test_send_brunAfterRead() throws InterruptedException {
        chatPage.send_brunAfterRead();
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送阅后即焚成功");
    }

    @Stories("聊天界面")
    @Title("发送礼包")
    @Test
    public void test_send_gift() throws InterruptedException {
        chatPage.click_back();
        ChatNewPage chatNewPage = new ChatNewPage(driver);
        chatNewPage.click_chatNew();
        chatNewPage.delectChat();

        chatNewPage.click_group();
        GroupPage groupPage = new GroupPage(driver);
        groupPage.click_myFristGroup();

        chatPage.send_gift();
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();

        Assertion.verifyEquals(is,true,"发送礼包成功");
    }
    @AfterClass
    public void tear(){
        driver.closeApp();
    }

}
