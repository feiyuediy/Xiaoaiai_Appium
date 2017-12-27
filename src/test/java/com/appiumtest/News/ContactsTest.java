package com.appiumtest.News;

import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.CallPages.ComingCallPage;
import com.appium.Pages.CallPages.VoiceCallPaeg;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Pages.MinePage.OtherUserInfoPage;
import com.appium.Pages.NewsPages.*;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import java.net.MalformedURLException;


@Features("联系人")
public class ContactsTest {
    private AndroidDriver launch;
    private AndroidDriver accpect;
    private ContactsPage contactsPage;
    private static String nick = "0001";

    @BeforeTest
    @Parameters({"driverName2", "remoteAddress2","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        System.out.println("login setup");
        launch = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);

    }
    @Stories("搜索并关注爱爱号")
    @Test
    public void search_aiai_test(){
        //登录
        LoginPage loginPage = new LoginPage(launch);
        loginPage.login("18676390090","123456");

        //点击消息进入消息页面
        AccostPage accostPage = new AccostPage(launch);
        accostPage.gotoNews();

        //进入到联系人tab
        ChatNewPage chatNewPage = new ChatNewPage(launch);
        chatNewPage.click_contacts();

        contactsPage = new ContactsPage(launch);
        contactsPage.searchAndAttention(nick);

    }

    @Stories("关注列表--拉黑")
    @Test
    public void attentionList_test(){
       //到关注列表中查看那个关注的人
        contactsPage.click_myAttountion();
        AttentionListPage attentionListPage = new AttentionListPage(launch);
        String nick_attention = attentionListPage.get_frist_nick();
        Assertion.verifyEquals(nick_attention, nick);

        //拉黑
        attentionListPage.click_nick();
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(launch);
        otherUserInfoPage.backOrUnback();
        //返回到联系人页面
        otherUserInfoPage.click_back();
        attentionListPage.click_back();
    }

    @Stories("拉黑列表--取消拉黑")
    @Test
    public void blackList_test(){
        //到拉黑列表中查看被拉黑的人
        contactsPage.click_myBlock();
        BlackListPage blackListPage = new BlackListPage(launch);
        String nick_black = blackListPage.get_frist_nick();
        Assertion.verifyEquals(nick_black, nick);

        //取消拉黑
        blackListPage.click_nick();
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(launch);
        otherUserInfoPage.backOrUnback();
        //返回到联系人页面
        otherUserInfoPage.click_back();
        blackListPage.click_back();

        //判断是否真的取消了拉黑
        contactsPage.click_myBlock();
        boolean isCancleBlack = blackListPage.isEmptyBlack();
        Assertion.verifyEquals(isCancleBlack,true);
        //返回到联系人页面
        blackListPage.click_back();
    }

    @Stories("我的粉丝列表--视频--语音--约跳")
    @Test
    @Parameters({"driverName2","apkPath"})
    public void myFollow_test(String driverName2, String apkPath){
        //点击我的粉丝到粉丝列表
        contactsPage.click_myFans();
        FansListPage fansListPage = new FansListPage(launch);

        String fans_nick = fansListPage.get_frist_nick();
        fansListPage.click_nick();
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(launch);

        //连接接收端的设备
        accpect = DriverCommon.getAndroidDriver(driverName2, "http://0.0.0.0:4724/wd/hub",apkPath);

        //接收端登录
        LoginPage loginPage = new LoginPage(accpect);
        loginPage.login("18676390007","123456");

        //邀请方点击语音
        otherUserInfoPage.click_voiceCall();


        //接收方点击接受按钮
        ComingCallPage comingCallPage = new ComingCallPage(accpect);
        comingCallPage.click_answer();

        //通话10s
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //接收方挂断
        VoiceCallPaeg voiceCallPaeg = new VoiceCallPaeg(accpect);
        voiceCallPaeg.click_hangup();
    }

    @AfterTest
    public void teardown(){
        DriverCommon.quit(launch);
        DriverCommon.quit(accpect);
    }

}
