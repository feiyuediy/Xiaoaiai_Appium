package com.appiumtest.News;

import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.NewsPages.ChatNewPage;
import com.appium.Pages.NewsPages.ChatPage;
import com.appium.Pages.NewsPages.GroupInfoPage;
import com.appium.Pages.NewsPages.GroupPage;
import com.appium.Utils.Assertion;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.net.MalformedURLException;
import java.util.Random;

/**
 * Created by admin on 2017/9/21.
 */
@Features("消息")
public class GroupInfoTest   {
    private GroupInfoPage groupInfoPage;

    private GroupPage groupPage;
    private ChatNewPage chatNewPage;
    private ChatPage chatPage;
    private AndroidDriver driver;

    @BeforeClass
    @Parameters({"driverName2", "remoteAddress2","apkPath"})
    public void setup(String driverName1, String remoteAddress1,String apkPath) throws MalformedURLException {
        System.out.println("login setup");
        driver = DriverCommon.getAndroidDriver(driverName1, remoteAddress1,apkPath);
    }

    @Stories("群资料")
    @Title("点击返回按钮")
    @Test
    public void test_click_back(){
        //登录
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("18676390321","123456");
        AccostPage accostPage = new AccostPage(driver);
        //点击消息tab
        accostPage.gotoNews();
        chatNewPage = new ChatNewPage(driver);
        //点击群组
        chatNewPage.click_group();
        groupPage = new GroupPage(driver);
        //点击我的群组中的一个群
        groupPage.click_myFristGroup();

        //点击资料
        chatPage = new ChatPage(driver);
        chatPage.click_ziliao();

        groupInfoPage = new GroupInfoPage(driver);
        groupInfoPage.click_back();
        System.out.println(driver.currentActivity());

        //再次进入到群资料
        chatPage.click_ziliao();
    }

    @Stories("群资料")
    @Title("管理员修改群名称")
    @Test
    public void test_modify_group_name(){
        Random random = new Random();

        int s = random.nextInt(10)%(10) + 1;
        String group_name = "武神"+Integer.toString(s);
        groupInfoPage.modify_group_name(group_name);

        Assertion.verifyEquals(group_name,groupInfoPage.get_group_name(),"管理员修改群名称");
    }

    @Stories("群资料")
    @Title("点击群号")
    @Test
    public void test_click_group_id(){
        groupInfoPage.click_group_id();
        System.out.println(driver.currentActivity());
        DriverCommon.back(driver);
    }

    @Stories("群资料")
    @Title("修改群介绍")
    @Test
    public void test_modify_group_desc(){
        Random random = new Random();

        int s = random.nextInt(10)%(10) + 1;
        String desc = "德玛西亚之力"+Integer.toString(s);
        groupInfoPage.modify_group_desc(desc);

        Assertion.verifyEquals(desc,groupInfoPage.get_group_desc(),"管理员修改群介绍");
    }

    @Stories("群资料")
    @Title("点击群成员进入到群成员界面")
    @Test
    public void test_click_number_list(){
        groupInfoPage.click_group_number_list();
        System.out.println(driver.currentActivity());

        DriverCommon.back(driver);
    }

    @Stories("群资料")
    @Title("管理员修改群公告")
    @Test
    public void test_modify_group_notice(){
        Random random = new Random();

        int s = random.nextInt(10)%(10) + 1;
        String notice = "群公告"+Integer.toString(s);

        groupInfoPage.modify_group_notice(notice);
        Assertion.verifyEquals(notice,groupInfoPage.get_group_notice(),"管理员修改群公告");
    }

    @Stories("群资料")
    @Title("非管理员不能修改群名称")
    @Test
    public void test_nomagener_click_group_name(){
        groupInfoPage.click_back();
        DriverCommon.back(driver);

        groupPage.click_mySecGroup();
        chatPage.click_ziliao();

        groupInfoPage.click_group_name();
        Assertion.verifyEquals(".ui.GroupInfoActivity",driver.currentActivity(),"非管理员不能修改群名称");

    }

    @Stories("群资料")
    @Title("非管理员不能修改群介绍")
    @Test
    public void test_nomagener_click_group_desc(){

        groupInfoPage.click_group_desc();
        Assertion.verifyEquals(".ui.GroupInfoActivity",driver.currentActivity(),"非管理员不能修改群介绍");
    }

    @Stories("群资料")
    @Title("非管理员不能显示加群申请")
    @Test
    public void test_nomagener_no_add_requst(){

        boolean is = groupInfoPage.isExitAddRequest();
        Assertion.verifyEquals(is,false,"非管理员不显示加群申请项");
    }

}
