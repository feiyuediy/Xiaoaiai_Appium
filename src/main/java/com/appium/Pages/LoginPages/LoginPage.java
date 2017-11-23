package com.appium.Pages.LoginPages;

import com.appium.PageBeans.LoginPageBeans.LoginBean;
import com.appium.PageBeans.LoginPageBeans.StarupBean;
import com.appium.Pages.AccostPages.AccostPage;
import com.appium.Pages.MinePage.MinePage;
import com.appium.Pages.MinePage.SettingPage;
import com.appium.Utils.Common;
import com.appium.Utils.DriverCommon;
import com.appium.Utils.Screenshot;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Point;

/**
 * Created by admin on 2017/8/29.
 */
public class LoginPage {
    private String activity = ".ui.LoginActivity";
    private AppiumDriver appiumDriver;
    private LoginBean loginBean;
    private StarupBean starupBean;

    public LoginPage(AppiumDriver appiumDriver1){
        appiumDriver = appiumDriver1;
        loginBean = new LoginBean(appiumDriver);
        starupBean = new StarupBean(appiumDriver);
    }

    //QQ登录
    public void qqlogin() {
        loginBean.QQlogin.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int screen_height_execute_phone = appiumDriver.manage().window().getSize().height; //screen height

        int y = (new   Double((1403.0/1920.0) * screen_height_execute_phone)).intValue(); ;
        System.out.println("y:"+y);
        appiumDriver.tap(1,30,y,0);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //微信登录
    public void weixinLogin(){
        loginBean.weixinlogin.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int screen_height_execute_phone = appiumDriver.manage().window().getSize().height; //screen height

        int y = (new   Double((538.0/876.0) * screen_height_execute_phone)).intValue(); ;
        System.out.println("y:"+y);
        appiumDriver.tap(1,200,y,0);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //微博登录
    public void weiboLogin(){
        loginBean.weiboLogin.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //退出登录
    public void quitLogin(){
        AccostPage accostPage = new AccostPage(appiumDriver);
        accostPage.gotoMine();
        MinePage minePage = new MinePage(appiumDriver);
        minePage.goSettingPage();
        SettingPage settingPage = new SettingPage(appiumDriver);
        DriverCommon.swipeToUp(appiumDriver,500,2);

        settingPage.click_quitLogin();
    }

    //输入账号
    public void setAcc(String acc){
        loginBean.account.input(acc);
    }
    //输入密码
    public void setPWd(String pwd){
        loginBean.pwd.clear();
        loginBean.pwd.input(pwd);
    }

    public void click_login(){
        loginBean.login.click();
    }
    //获取页面title
    public String getTitle(){
        return loginBean.title.getText();
    }
    //登录
    public void login(String acc, String pwd){
        starupBean.login.click();
        loginBean.account.clear();
        loginBean.account.input(acc);
        loginBean.pwd.input(pwd);
        loginBean.login.click();
    }
}
