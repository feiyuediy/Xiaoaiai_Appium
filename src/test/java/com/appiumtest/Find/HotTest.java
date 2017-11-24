package com.appiumtest.Find;

import com.appium.Moudle.TestcaseBase;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.FindPages.HotPage;
import com.appium.Pages.FindPages.MoreTopicPage;
import com.appium.Pages.FindPages.RemindPage;
import com.appium.Pages.FindPages.ThemeFeedsPage;
import com.appium.Pages.LoginPages.LoginPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.Common;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;

/**
 * Created by admin on 2017/9/5.
 */

@Features("发现")
public class HotTest extends TestcaseBase{
    private HotPage hotPage;
    private AccostPage accostPage;
    private AppiumDriver appiumDriver;
    private MoreTopicPage moreTopicPage;
    private RemindPage remindPage;


    @BeforeClass
    @Parameters({"driverName2", "remoteAddress2","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        System.out.println("login setup");
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
        driver = (AndroidDriver) appiumDriver;
    }

    @Test
    @Stories("热门")
    @Title("点击提醒按钮")
    public void test_click_remind(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18676390321","123456");
        accostPage = new AccostPage(driver);
        accostPage.gotoFind();
        hotPage = new HotPage(driver);
        hotPage.click_remind();
        Assertion.verifyEquals(".ui.TipListActivity",driver.currentActivity(),"点击全部提醒跳转到提醒页面");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("热门")
    @Title("动态信息检查")
    public void test_click_zan() throws InterruptedException {
        DriverCommon.swipeToUp(driver,500,1);
        while (true){
            if (hotPage.iszan()){
                DriverCommon.swipeToUp(driver,500,1);
            }else {
                System.out.println("没有点赞,进行点赞");;
                hotPage.click_zan();
                break;
            }
        }
    }


    @Test
    @Stories("热门")
    @Title("点击发布动态按钮")
    public void test_click_publsh() throws InterruptedException {
        hotPage.click_publsh();
        Thread.sleep(2000);
        Assertion.verifyEquals(true,hotPage.isExitFeed(),"点击发布动态按钮，是否弹出对话框");
        hotPage.click_cancle_publish();
        Assertion.verifyEquals(false,hotPage.isExitFeed(),"点击弹窗中的取消，对话框消失");
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();
        Assertion.verifyEquals(".shortvideo.ShortVideoRecordActivity",driver.currentActivity(),"点击发布动态-视频，跳转到录制视频页面");
        driver.pressKeyCode(4);
        hotPage.click_publsh();
        hotPage.click_publish_text();
        Assertion.verifyEquals(".ui.PostNewsGridActivity",driver.currentActivity(),"点击发布动态，文字/图片进入到发布动态页面");
        driver.pressKeyCode(4);
    }
    @Test
    @Stories("热门")
    @Title("点击banner图")
    public void test_click_banner() throws InterruptedException {
        hotPage.click_banner();
        Assertion.verifyEquals(".ui.H5Activity",driver.currentActivity(),"点击banner图进入到H5页面");
        System.out.println(driver.currentActivity());
        Thread.sleep(1000);
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("热门")
    @Title("检查轮播话题")
    public void test_check_cr_topic(){
        boolean is = false;
        for (int t=0;t<10;t++){
            System.out.println("第"+t+"此尝试");
            try{
                is = hotPage.isExitCRToptic();
                break;
            }catch (Exception e){

            }
        }
        Assertion.verifyEquals(is,true,"检查轮播话题是否存在");

    }

    @Test
    @Stories("热门")
    @Title("点击轮播话题")
    public void test_click_cr_topic(){
        hotPage.click_CRToptic();
        Assertion.verifyEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"点击轮播话题，进入到该话题列表");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("热门")
    @Title("点击更多圈子")
    public void test_click_moreTopic(){
        hotPage.cick_moreTopic();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.CircleAllActivity",driver.currentActivity(),"点击轮播话题，进入到该话题列表");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("热门")
    @Title("动态信息检查")
    public void test_click_ui_feed() throws InterruptedException {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width / 2, height *3/ 4, width / 2, height * 7 / 20, 500);
        Thread.sleep(2);
        boolean is = hotPage.isExitPublisherTag();
        Assertion.verifyEquals(true,is,"检查发布人的各种标签");
    }

    @Test
    @Stories("热门")
    @Title("点击动态中的用户头像")
    public void test_click_head(){
        hotPage.click_head();
        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("热门")
    @Title("点击动态进入到动态详情")
    public void test_click_feed(){
        hotPage.click_feed();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.FeedDetailActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("热门")
    @Title("点击动态中的图片")
    public void test_click_img_container(){
        hotPage.click_img();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.DraweeGalleryActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("热门")
    @Title("点击动态中的标签")
    public void test_click_topicTag(){
        hotPage.click_topicTags();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("热门")
    @Title("点击动态中的举报按钮")
    public void test_click_report(){
        hotPage.click_report();
        boolean is = hotPage.repotrFrameIsExit();
        Assertion.verifyEquals(true,is,"点击举报按钮，弹出举报弹窗");
        hotPage.click_cancle_report();
        boolean is1 = hotPage.repotrFrameIsExit();
        Assertion.verifyEquals(false,is1,"点击举报按钮弹窗中的取消按钮，弹窗消失");
        hotPage.click_report();
        hotPage.click_confirm_report();
        boolean is2 = hotPage.repotrFrameIsExit();
        Assertion.verifyEquals(false,is2,"点击举报按钮弹窗中的确定按钮，弹窗消失");
    }

    @Test
    @Stories("热门")
    @Title("点击评论按钮")
    public void test_click_comment(){
        hotPage.click_comment();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.FeedDetailActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        driver.pressKeyCode(4);
    }

    @Test
    @Stories("热门")
    @Title("点击点赞头像")
    public void test_click_zan_headImg(){
        hotPage.click_zan_imgHead();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        driver.pressKeyCode(4);
    }
    @Test
    @Stories("热门")
    @Title("点击点赞头像")
    public void test_click_zan_more(){
        hotPage.click_zan_more();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.FeedDetailActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        driver.pressKeyCode(4);
    }



    @Stories("圈子页面")
    @Title("UI检查")
    @Test
    public void test_check_ui(){
        DriverCommon.swipeToDown(appiumDriver,500,1);

        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoFind();
        hotPage = new HotPage(driver);
        hotPage.cick_moreTopic();
        moreTopicPage = new MoreTopicPage(driver);
        String title = moreTopicPage.getTitle();
        Assertion.verifyEquals("圈子",title,"检查title名称：圈子");

        boolean isExitBack = moreTopicPage.isBackExit();
        Assertion.verifyEquals(true,isExitBack,"检查返回按钮是否存在");

        boolean isExitEdit = moreTopicPage.isEditExit();
        Assertion.verifyEquals(true,isExitEdit,"检查编辑按钮是否存在");
    }


    @Stories("圈子页面")
    @Title("点击编辑按钮")
    @Test
    public void test_click_edit(){
        moreTopicPage.click_edit();
        String activity = driver.currentActivity();

        Assertion.verifyEquals(".ui.PostNewsGridActivity",activity,"点击编辑按钮跳转到发布话题界面");
        driver.pressKeyCode(4);
    }
    @Stories("圈子页面")
    @Title("点击推荐话题")
    @Test
    public void test_click_recommend() throws InterruptedException {
        moreTopicPage.click_recommend(1);
        String activity = driver.currentActivity();

        Assertion.verifyEquals(".ui.ThemeFeedsActivity",activity,"点击推荐话题跳转到该话题的页面");
        driver.pressKeyCode(4);
        Thread.sleep(3000);
    }

    @Stories("圈子页面")
    @Title("滑动推荐话题")
    @Test
    public void test_swip_recommend(){
        String imgAfter = moreTopicPage.screenshotFristRecommendImg();
        moreTopicPage.swipRecommend(3,1);
        String imgBefore = moreTopicPage.screenshotFristRecommendImg();
        boolean is = Common.comparePint(imgAfter,imgBefore,90);
        Assertion.verifyEquals(false,is,"滑动推荐话题");
    }

    @Stories("圈子页面")
    @Title("点击更多推荐圈子按钮")
    @Test
    public void test_click_moreRecommend(){
        moreTopicPage.click_recommend(4);
        System.out.println(driver.currentActivity());
        driver.pressKeyCode(4);
    }

    @Stories("圈子页面")
    @Title("点击话题列表")
    @Test
    public void test_click_topicList(){
        String topicName = moreTopicPage.getTopicName(3);
        moreTopicPage.click_topic(3);
        Assertion.verifyEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"点击话题跳转到该话题的页面");
        ThemeFeedsPage themeFeedsPage = new ThemeFeedsPage(driver);
        String title = themeFeedsPage.getTitle();
        Assertion.verifyEquals(title,topicName,"检查跳转的主题动态是否是该动态");
        driver.pressKeyCode(4);
    }
    @Stories("圈子页面")
    @Title("翻页到最后显示没有更多数据")
    @Test
    public void test_swip() throws InterruptedException {
        for(int i=0;i<6;i++){
            DriverCommon.swipeToUp(driver,500,1);
            Thread.sleep(1000);
        }
        boolean is = moreTopicPage.isExitState();
        Assertion.verifyEquals(true,is,"检查最后的没有多数据是否存在");

        String txt = moreTopicPage.getStateTxt();
        Assertion.verifyEquals("没有更多数据了",txt,"检查最后的没有多数据文字");
        driver.pressKeyCode(4);
    }



    @Stories("全部提醒")
    @Title("UI检查")
    @Test
    public void test_check_ui_remade(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("18676390321","123456");
        AccostPage accostPage = new AccostPage(driver);
        accostPage.gotoFind();
        hotPage = new HotPage(driver);
        hotPage.click_remind();
        remindPage = new RemindPage(driver);
        String title = remindPage.getTitle();
        Assertion.verifyEquals("全部提醒",title,"检查title名称：全部提醒");
    }

    @Stories("全部提醒")
    @Title("点击返回按钮")
    @Test
    public void test_click_back_remde(){
        remindPage.click_back();
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity(),"点击返回按钮返回到主页面");
        hotPage.click_remind();
    }

    @Stories("全部提醒")
    @Title("点击视频动态")
    @Test
    public void test_click_vedioFeed(){
        remindPage.click_video_feed(0);
        Assertion.verifyEquals(".ui.VideoFeedDetailActivity",driver.currentActivity(),"点击视频动态提醒进入到视频动态");
        driver.pressKeyCode(4);
    }

    @Stories("全部提醒")
    @Title("点击图文动态")
    @Test
    public void test_click_textFeed(){
        remindPage.click_txt_feed(0);

        Assertion.verifyEquals(".ui.FeedDetailActivity",driver.currentActivity(),"点击图文动态提醒进入到图文动态");
        System.out.println(driver.currentActivity());
        driver.pressKeyCode(4);
    }

    @Stories("全部提醒")
    @Title("点击头像")
    @Test
    public void test_click_headImg() throws InterruptedException {
        remindPage.click_name(2);
        System.out.println(driver.currentActivity());
        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击头像进入到用户资料页面");
        driver.pressKeyCode(4);
        Thread.sleep(2000);
        driver.pressKeyCode(4);
    }

    @AfterClass
    public void tear(){

        appiumDriver.quit();
    }
}
