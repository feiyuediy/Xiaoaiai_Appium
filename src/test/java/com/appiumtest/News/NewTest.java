package com.appiumtest.News;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Pages.MinePage.OtherUserInfoPage;
import com.appium.Pages.NewsPages.*;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Features("消息")
@Listeners({com.appium.Listener.AssertionListener.class })

public class NewTest extends TestcaseBase {
    private AccostPage accostPage;
    private ChatPage chatPage;
    private ChatNewPage chatNewPage;
    private GroupPage groupPage;
    private ContactsPage contactsPage;
    private AppiumDriver launch;

    private static String nick = "0001";

    @BeforeClass
    @Parameters({"driverName1", "remoteAddress1","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
        launch = driver;
    }

    @Stories("消息-聊天界面")
    @Title("点击返回按钮")
    @Test
    public void test_click_back(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18688880000","123456");
        accostPage = new AccostPage(driver);
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

    @Stories("消息-聊天界面")
    @Title("点击资料")
    @Test
    public void test_click_ziliao(){
        chatPage.click_ziliao();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(driver.currentActivity(),".ui.GroupInfoActivity","点击资料跳转到群资料");
        driver.pressKeyCode(4);
    }

    @Stories("消息-聊天界面")
    @Title("发送文本")
    @Test
    public void test_send_txt(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        String txt = df.format(new Date())+"哈哈";
        chatPage.send_txt(txt);

        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送文本成功");
    }

    @Stories("消息-聊天界面")
    @Title("发送语音")
    @Test
    public void test_send_voice() throws InterruptedException {

        chatPage.send_voice(3);
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送语音成功");
    }

    @Stories("消息-聊天界面")
    @Title("发送表情")
    @Test
    public void test_send_emoj() throws InterruptedException {

        chatPage.send_emoj();
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送表情成功");

    }

    @Stories("消息-聊天界面")
    @Title("发送图片")
    @Test
    public void test_send_pic() throws InterruptedException {
        chatPage.send_pic();
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送图片成功");
    }

    @Stories("消息-聊天界面")
    @Title("发送阅后即焚")
    @Test
    public void test_send_brunAfterRead() throws InterruptedException {
        chatPage.send_brunAfterRead();
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送阅后即焚成功");
    }

    @Stories("消息-聊天界面")
    @Title("发送礼包")
    @Test
    public void test_send_gift() throws InterruptedException {

        chatPage.send_gift();
//        Thread.sleep(10000);
        boolean is= chatPage.get_msg_status();
        Assertion.verifyEquals(is,true,"发送礼包成功");
        driver.pressKeyCode(4);
    }

    @Stories("群组")
    @Title("点击banner图")
    @Test
    public void test_click_banner(){

        accostPage = new AccostPage(driver);
        accostPage.gotoNews();
        chatNewPage = new ChatNewPage(driver);
        chatNewPage.click_group();
        groupPage = new GroupPage(driver);
        groupPage.click_banner();
        String activity = driver.currentActivity();
        driver.pressKeyCode(4);
        Assertion.verifyEquals(activity,".ui.H5Activity","点击banner图跳转到配置的h5页面");
    }

    @Stories("群组")
    @Title("点击我的群组")
    @Test
    public void test_click_myGroup(){
        String name = groupPage.get_myFristGroupName();
        String desc = groupPage.get_myFristGroupDesc();
        groupPage.click_myFristGroup();
        String activity = driver.currentActivity();
        driver.pressKeyCode(4);
        Assertion.verifyEquals(activity,".ui.ChatActivity","点击我的群组跳转到聊天界面");

    }

    @Stories("群组")
    @Title("点击推荐群组")
    @Test
    public void test_click_recommendGroup(){
        String name = groupPage.get_fristRecommendGroupName();
        String desc = groupPage.get_fristRecommendGroupDesc();
        groupPage.click_fristRecommendGroup();
        String activity = driver.currentActivity();
        Assertion.verifyEquals(activity,".ui.ChatActivity","点击点击推荐群组跳转到群资料聊天界面");
        driver.pressKeyCode(4);
    }

    @Stories("群组")
    @Title("点击全部群组")
    @Test
    public void test_click_allGrout(){
        groupPage.click_allGroup();
        String activity = driver.currentActivity();
        driver.pressKeyCode(4);
        Assertion.verifyEquals(activity,".ui.GroupCategoryLabelNewActivity","点击全部群组跳转到全部界面");
    }

    @Stories("联系人")
    @Title("搜索爱爱号")
    @Test
    public void search_aiai_test(){


        //点击消息进入消息页面
        AccostPage accostPage = new AccostPage(launch);
        accostPage.gotoNews();

        //进入到联系人tab
        ChatNewPage chatNewPage = new ChatNewPage(launch);
        chatNewPage.click_contacts();

        contactsPage = new ContactsPage(launch);
        contactsPage.searchAndAttention(nick);

    }
    @Stories("联系人")
    @Title("关注列表--拉黑")
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

    @Stories("联系人")
    @Title("拉黑列表--取消拉黑")
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


    @AfterClass
    public void tear(){
        driver.quit();
    }

}
