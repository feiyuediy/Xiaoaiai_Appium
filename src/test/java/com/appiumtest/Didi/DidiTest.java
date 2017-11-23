package com.appiumtest.Didi;


import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.CallPages.VidelCallPage;
import com.appium.Pages.CallPages.VoiceCallPaeg;
import com.appium.Pages.CallPages.YuetiaoCallPage;
import com.appium.Pages.DidiPages.*;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Pages.MinePage.MinePage;
import com.appium.Pages.MinePage.OtherUserInfoPage;
import com.appium.Pages.NewsPages.ChatNewPage;
import com.appium.Pages.NewsPages.ChatPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.Common;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;

@Features("DIDI")
public class DidiTest extends TestcaseBase {
    private AndroidDriver passge;
    private DidiPage didiPage;
    private OrderFrame orderFrame;
    private MinePage minePage;
    private  AccostPage accostPage_passge;
    private FollowFramPage followFramPage;
    private int remanent_aiai;

    @BeforeClass
    @Parameters({"driverName1", "driverName2"})
    public void setup(String driverName1, String driverName2) throws MalformedURLException {

        passge = DriverCommon.getAndroidDriver(driverName1, "http://0.0.0.0:4723/wd/hub");
        driver = DriverCommon.getAndroidDriver(driverName2, "http://0.0.0.0:4724/wd/hub");
        driver2 = passge;
    }
    @Test
    @Stories("视频")
    @Title("didi视频")
    public void test_didi_video() {
        //登录乘客账号
        LoginPage loginPage_passger = new LoginPage(passge);
        loginPage_passger.login("18676390321", "123456");

        //登录司机账号
        LoginPage loginPage_driver = new LoginPage(driver);
        loginPage_driver.login("18676390001", "123456");

        //或取乘客的剩余爱爱豆
        accostPage_passge = new AccostPage(passge);
        accostPage_passge.gotoMine();

        minePage = new MinePage(passge);
        remanent_aiai = minePage.get_remaind_aiai();
        System.out.println("余额："+remanent_aiai);
        //乘客发起滴滴视频
        accostPage_passge.gotoDIdi();
        didiPage = new DidiPage(passge);

        didiPage.click_video();


        didiPage.creat_didi_video();

        //司机接单
        orderFrame = new OrderFrame(driver);
        orderFrame.click_accept();
        DriverCommon.Hand_permission(driver);
        DriverCommon.Hand_permission(driver);
        //通话两分钟
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //司机挂断
        VidelCallPage videlCallPage = new VidelCallPage(driver);
        videlCallPage.click_refuse();

        //乘客评价
        EvaluatePage evaluatePage = new EvaluatePage(passge);
        evaluatePage.evaluteStar(3);

        //乘客查看是否扣除了爱爱豆
        accostPage_passge.gotoMine();
        int y = minePage.get_remaind_aiai();
        System.out.println("视频后余额："+y);


        //司机查看发送礼物信息
        AccostPage accostPage_driver = new AccostPage(driver);
        accostPage_driver.gotoNews();//进入到消息界面
        ChatNewPage chatNewPage = new ChatNewPage(driver);
        chatNewPage.click_frist_new(); //进入到聊天界面

        //点击中间让输入框消失，不然的话。获取礼物信息很难到
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("第一次点击屏幕");
        DriverCommon.tapInMid(driver);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("第二次点击屏幕");
        DriverCommon.tapInMid(driver);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chatNewPage.click_timestamp();

        ChatPage chatPage = new ChatPage(driver);
        String fristMsg = chatPage.get_msg(1);
        String secMsg = chatPage.get_msg(2);
        //司机返回到首页
        chatPage.click_back();
        driver.pressKeyCode(4);
        accostPage_passge.gotoDIdi();

        System.out.println("fristMsg:"+fristMsg);
//        Assertion.verifyEquals(fristMsg.contains("通话时长"),true);
        Assertion.verifyEquals(remanent_aiai-y,20);
        remanent_aiai = y;
        System.out.println("secMsg:"+secMsg);
//        Assertion.verifyEquals("23424234给0001赠送了 粥×20",secMsg);
    }


    @Test
    @Stories("语音")
    @Title("didi语音")
    public void test_didi_voice() {
        //点击语音，进入到didi语音界面
        accostPage_passge.gotoDIdi();
        didiPage.click_voice();

        //设置额外打赏和捎话
        didiPage.set_reward();
        String takeMsg = "来聊我啊"+ Common.getRandmin();
        didiPage.set_msg(takeMsg);

        //乘客端获取打赏和捎话
        String reward = didiPage.get_reward();
        System.out.println("乘客端的打赏：" + reward);

        String msg = didiPage.get_takeMsg();
        System.out.println("乘客端的捎话：" + msg);
        //点击滴一下
        didiPage.click_di();

        //司机接单端校验打赏和捎话
        orderFrame = new OrderFrame(driver);
        String reward_drive = orderFrame.get_reward_by_send();
        System.out.println("司机端的打赏：" + reward_drive);

//        Assertion.verifyEquals("  额外打赏"+reward, reward_drive);//额外打赏验证
        String msg_drive = orderFrame.get_msg_by_send();
        System.out.println("司机端的捎话：" + msg_drive);
//        Assertion.verifyEquals("给你捎话："+msg, msg_drive);//捎话验证

        //点击接受按钮
        orderFrame.click_accept();

        //通话两分钟
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //司机挂断
        VoiceCallPaeg voiceCallPaeg = new VoiceCallPaeg(driver);
        voiceCallPaeg.click_hangup();

        //乘客评价
        EvaluatePage evaluatePage = new EvaluatePage(passge);
        evaluatePage.evaluteStar(5);

        //乘客查看是否扣除了爱爱豆
        accostPage_passge.gotoMine();
        int y = minePage.get_remaind_aiai();
        System.out.println("remanent_aiai："+remanent_aiai);
        System.out.println("y:"+y);
        Assertion.verifyEquals(remanent_aiai-y,11);
        remanent_aiai = y;

        //司机查看发送礼物信息
        AccostPage accostPage_driver = new AccostPage(driver);
        accostPage_driver.gotoNews();//进入到消息界面
        ChatNewPage chatNewPage = new ChatNewPage(driver);
        chatNewPage.click_frist_new(); //进入到聊天界面

        ChatPage chatPage = new ChatPage(driver);
        String fristMsg = chatPage.get_msg(3);
        String secMsg = chatPage.get_msg(4);
        //司机返回到首页
        chatPage.click_back();
        driver.pressKeyCode(4);

        System.out.println("fristMsg:"+fristMsg);
//        Assertion.verifyEquals(fristMsg.contains("通话时长"),true);

        System.out.println("secMsg:"+secMsg);
//        Assertion.verifyEquals("23424234给0001赠送了 粥×20",secMsg);
    }


    @Test
    @Stories("约跳")
    @Title("didi约跳")
    public void test_didi_yuetiao() throws InterruptedException {
        Thread.sleep(20000);
        accostPage_passge.gotoDIdi();
        didiPage.click_yuetiao();
        driver.tap(1,700,700,1000);//让那个输入框消失

        Thread.sleep(20000);
        didiPage.click_yuetiao();
        driver.tap(1,700,700,1000);//让那个输入框消失


        //乘客发起didiyuetia
        didiPage.click_yuetiao();
        didiPage.click_di();

        //司机点击接受
        orderFrame.click_accept();

        YuetiaoCallPage yuetiaoCallPage_driver = new YuetiaoCallPage(driver);
        yuetiaoCallPage_driver.click_device_dialog_cancle();

        //通话20S
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //司机点击断开按钮
        yuetiaoCallPage_driver.click_close();
        yuetiaoCallPage_driver.click_dialog_ok();

        //乘客点击我知道了
        YuetiaoCallPage yuetiaoCallPage_passger = new YuetiaoCallPage(passge);
        yuetiaoCallPage_passger.click_close_dialog_ok();

        //乘客评价
        EvaluatePage evaluatePage = new EvaluatePage(passge);
        evaluatePage.evaluteStar(5);

        //乘客查看是否扣除了爱爱豆
        accostPage_passge.gotoMine();
        int y = minePage.get_remaind_aiai();
        System.out.println("remanent_aiai："+remanent_aiai);
        System.out.println("y:"+y);
        Assertion.verifyEquals(remanent_aiai-y,20);
        remanent_aiai = y;

        //司机查看发送礼物信息
        AccostPage accostPage_driver = new AccostPage(driver);
        accostPage_driver.gotoNews();//进入到消息界面
        ChatNewPage chatNewPage = new ChatNewPage(driver);
        chatNewPage.click_frist_new(); //进入到聊天界面

        ChatPage chatPage = new ChatPage(driver);
        String fristMsg = chatPage.get_msg(5);

        System.out.println("frist:"+fristMsg);

    }

    @Test
    @Stories("互粉")
    @Title("didi互粉")
    public void test_didi_follow() throws InterruptedException {
        //点击互粉，进入到didi互粉界面
        accostPage_passge.gotoDIdi();
        didiPage.click_fllow();

        //获取免费次数
        String freeTime = didiPage.get_follow_price();
        System.out.println("freeTime:"+freeTime);

        //消耗掉免费的次数
        if (freeTime.contains("免费")){
            System.out.println(freeTime.substring(4,freeTime.length()-1));
            int b = Integer.valueOf(freeTime.substring(4,freeTime.length()-1));
            for (int i = 0;i<b;i++){
                didiPage.creat_diid_follow();
                FollowFramPage followFramPage = new FollowFramPage(passge);
                String drive_nick = followFramPage.get_nick();
                System.out.println("drive_nick:"+drive_nick);
                followFramPage.click_viewData();
                OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(passge);
                otherUserInfoPage.backOrUnback();
                Thread.sleep(3000);
                otherUserInfoPage.backOrUnback();
                otherUserInfoPage.click_back();
                driver.tap(1,500,500,1000);//司机点一下，不然60s之后会退出的
            }
        }

        //使用爱爱豆
        didiPage.creat_diid_follow();
        FollowFramPage followFramPage = new FollowFramPage(passge);
        String drive_nick = followFramPage.get_nick();
        System.out.println("drive_nick:"+drive_nick);
        followFramPage.click_viewData();
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(passge);
        //关注后要进行拉黑。还原环境
        otherUserInfoPage.backOrUnback();
        Thread.sleep(3000);
        otherUserInfoPage.backOrUnback();
        otherUserInfoPage.click_back();

        //乘客查看是否扣除了爱爱豆
        accostPage_passge.gotoMine();
        int y = minePage.get_remaind_aiai();
        System.out.println("remanent_aiai："+remanent_aiai);
        System.out.println("y:"+y);
        Assertion.verifyEquals(remanent_aiai-y,10);
        remanent_aiai = y;
    }

    @AfterClass
    public void teardown(){
        driver.quit();
        passge.quit();
    }
}