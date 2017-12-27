package com.appiumtest.Call;


import com.appium.Moudle.TestcaseBase;
import com.appium.PageBeans.NewPageBeans.SearchPageBean;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.CallPages.ComingCallPage;
import com.appium.Pages.CallPages.VidelCallPage;
import com.appium.Pages.CallPages.VoiceCallPaeg;
import com.appium.Pages.DidiPages.DidiPage;
import com.appium.Pages.DidiPages.FollowFramPage;
import com.appium.Pages.DidiPages.OrderFrame;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Pages.MinePage.MinePage;
import com.appium.Pages.MinePage.OtherUserInfoPage;
import com.appium.Pages.NewsPages.ChatNewPage;
import com.appium.Pages.NewsPages.ContactsPage;
import com.appium.Pages.NewsPages.FansListPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.Common;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;


@Features("通话")
@Listeners({com.appium.Listener.AssertionListener.class })

public class CallTest extends TestcaseBase{

    private AndroidDriver lauch;
    private AndroidDriver accpect;
    private static String accpect_num = "8011245";
    private static String lauch_num = "8000415";
    private static String lauch_nick = "88880000";
    private AccostPage accostPage;
    private MinePage minePage;
    private int aiai_num;
    private ContactsPage contactsPage_accpect;

    @BeforeClass
    @Parameters({"driverName1", "driverName2","apkPath"})
    public void setup(String driverName1, String driverName2, String apkPath) throws MalformedURLException {
        lauch = DriverCommon.getAndroidDriver(driverName1, "http://localhost:4723/wd/hub",apkPath);
        accpect = DriverCommon.getAndroidDriver(driverName2, "http://localhost:4724/wd/hub",apkPath);
        driver2 = lauch;
        driver = accpect;
    }
    @Test
    @Stories("视频")
    @Title("非粉丝视频收费")
    public void test_notfans_video() throws InterruptedException {
        //登录发起方
        LoginPage loginPage = new LoginPage(lauch);
        loginPage.login(lauch_num,"123456");

        //获取发起方的爱爱豆
        accostPage = new AccostPage(lauch);
        accostPage.gotoMine();
        minePage = new MinePage(lauch);
        aiai_num = minePage.get_remaind_aiai();

        //进入到消息页面查找进入到个人资料页面
        accostPage.gotoNews();
        ChatNewPage chatNewPage = new ChatNewPage(lauch);
        chatNewPage.click_contacts();
        ContactsPage contactsPage = new ContactsPage(lauch);
        contactsPage.search(accpect_num);
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(lauch);


        //登录接收方
        LoginPage loginPage_accpect = new LoginPage(accpect);
        loginPage_accpect.login(accpect_num,"123456");
        Thread.sleep(5000);
        //拨打接收方电话
        otherUserInfoPage.click_videoCall();
        otherUserInfoPage.click_ok();

        //点击权限弹窗
        DriverCommon.Hand_permission(lauch);
        DriverCommon.Hand_permission(lauch);

        //接受方接受
        ComingCallPage comingCallPage = new ComingCallPage(accpect);
        comingCallPage.click_answer();

        Thread.sleep(10000);
        //发起方挂断
        VidelCallPage videlCallPage = new VidelCallPage(lauch);
        videlCallPage.click_refuse();

        //发起方看自己的爱爱豆是否少了
        otherUserInfoPage.click_back();
        SearchPageBean  searchPageBean =  new SearchPageBean(lauch);
        searchPageBean.back.click();
        DriverCommon.goSleep(1);
        searchPageBean.back.click();
        accostPage.gotoMine();
        int after_aiai_num = minePage.get_remaind_aiai();
        Assertion.verifyEquals(aiai_num-after_aiai_num,40,"非粉丝视频通话后爱爱豆减少");

    }

    @Test
    @Stories("语音")
    @Title("非粉丝语音收费")
    public void test_notfans_voice() throws InterruptedException {

        //进入到消息页面查找进入到个人资料页面
        accostPage.gotoNews();
        ChatNewPage chatNewPage = new ChatNewPage(lauch);
        chatNewPage.click_contacts();
        ContactsPage contactsPage = new ContactsPage(lauch);
        contactsPage.search(accpect_num);
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(lauch);

        Thread.sleep(5000);
        //拨打接收方电话
        otherUserInfoPage.click_voiceCall();
        otherUserInfoPage.click_ok();


        //接受方接受
        ComingCallPage comingCallPage = new ComingCallPage(accpect);
        comingCallPage.click_answer();

        Thread.sleep(10000);
        //发起方挂断
        VoiceCallPaeg voiceCallPaeg = new VoiceCallPaeg(lauch);
        voiceCallPaeg.click_hangup();

        //发起方看自己的爱爱豆是否少了
        otherUserInfoPage.click_back();
        SearchPageBean  searchPageBean =  new SearchPageBean(lauch);
        searchPageBean.back.click();
        DriverCommon.goSleep(1);
        searchPageBean.back.click();
        accostPage.gotoMine();
        int after_aiai_num = minePage.get_remaind_aiai();
        Assertion.verifyEquals(aiai_num-after_aiai_num,40+30,"非粉丝语音通话后爱爱豆减少");
    }

    @Test
    @Stories("视频")
    @Title("粉丝视频免费")
    public void test_fans_video() throws InterruptedException {
        //接收方关注发起方
        AccostPage accostPage_accpect = new AccostPage(accpect);
        accostPage_accpect.gotoNews();
        ChatNewPage chatNewPage_accpect = new ChatNewPage(accpect);
        chatNewPage_accpect.click_contacts();
        contactsPage_accpect = new ContactsPage(accpect);
        contactsPage_accpect.searchAndAttention(lauch_num);

        //发起方进入到消息页面查找进入到个人资料页面
        accostPage.gotoNews();
        ChatNewPage chatNewPage = new ChatNewPage(lauch);
        chatNewPage.click_contacts();
        ContactsPage contactsPage = new ContactsPage(lauch);
        contactsPage.search(accpect_num);
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(lauch);

        Thread.sleep(5000);
        //拨打接收方电话
        otherUserInfoPage.click_videoCall();

        //接受方接受
        ComingCallPage comingCallPage = new ComingCallPage(accpect);
        comingCallPage.click_answer();

        Thread.sleep(10000);
        //发起方挂断
        VidelCallPage videlCallPage = new VidelCallPage(lauch);
        videlCallPage.click_refuse();

        //发起方看自己的爱爱豆是否少了
        otherUserInfoPage.click_back();
        lauch.pressKeyCode(4);
        Thread.sleep(2000);
        lauch.pressKeyCode(4);
        accostPage.gotoMine();
        int after_aiai_num = minePage.get_remaind_aiai();
        Assertion.verifyEquals(aiai_num-after_aiai_num,40+30,"非粉丝语音通话后爱爱豆减少");
    }

    @Test
    @Stories("语音")
    @Title("粉丝语音免费")
    public void test_fans_voice() throws InterruptedException {

        //进入到消息页面查找进入到个人资料页面
        accostPage.gotoNews();
        ChatNewPage chatNewPage = new ChatNewPage(lauch);
        chatNewPage.click_contacts();
        ContactsPage contactsPage = new ContactsPage(lauch);
        contactsPage.search(accpect_num);
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(lauch);

        Thread.sleep(5000);
        //拨打接收方电话
        otherUserInfoPage.click_voiceCall();


        //接受方接受
        ComingCallPage comingCallPage = new ComingCallPage(accpect);
        comingCallPage.click_answer();

        Thread.sleep(10000);
        //发起方挂断
        VoiceCallPaeg voiceCallPaeg = new VoiceCallPaeg(lauch);
        voiceCallPaeg.click_hangup();

        //发起方看自己的爱爱豆是否少了
        otherUserInfoPage.click_back();
        lauch.pressKeyCode(4);
        Thread.sleep(2000);
        lauch.pressKeyCode(4);
        accostPage.gotoMine();
        int after_aiai_num = minePage.get_remaind_aiai();
        Assertion.verifyEquals(aiai_num-after_aiai_num,40+30,"非粉丝语音通话后爱爱豆减少");

        //恢复环境，取消关注
        contactsPage_accpect.click_myAttountion();
        FansListPage fansListPage = new FansListPage(accpect);
        fansListPage.cancleAttention(lauch_nick);
    }


    @AfterClass
    public void teardown(){
        DriverCommon.quit(lauch);
        DriverCommon.quit(accpect);
    }
}
