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

import javax.swing.plaf.TableHeaderUI;

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
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        appiumDriver.findElementByXPath("//android.widget.Button[@resource-id='com.tencent.mobileqq:id/name']").click();
    }

    //微信登录
    public void weixinLogin(){
        loginBean.weixinlogin.click();
        try {
            Thread.sleep(1000);
            appiumDriver.findElementByXPath("//android.widget.EditText[@resource-id='com.tencent.mm:id/hb' and @text='请填写微信号/QQ号/邮箱']").sendKeys("13242009460");
            appiumDriver.findElementByXPath("//android.widget.LinearLayout[@resource-id='com.tencent.mm:id/bow']/android.widget.EditText[1]").sendKeys("test@123");
            appiumDriver.findElementByXPath("//android.widget.Button[@resource-id='com.tencent.mm:id/boy']").click();
        } catch (Exception e) {
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //微博登录
    public void weiboLogin(){
        loginBean.weiboLogin.click();
        try{
            Thread.sleep(5000);
            appiumDriver.findElementById("com.sina.weibo:id/etLoginUsername").sendKeys("13242009460");
            appiumDriver.findElementById("com.sina.weibo:id/etPwd").sendKeys("test@123");
            appiumDriver.findElementByXPath("//android.widget.Button[@resource-id='com.sina.weibo:id/bnLogin']").click();

            try {
                Thread.sleep(2000);
                appiumDriver.findElementByXPath("//android.widget.Button[@resource-id='com.sina.weibo:id/bnLogin']").click();
                Thread.sleep(5000);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }catch (Exception e){
            try {

                Thread.sleep(1000);
                appiumDriver.findElementByXPath("//android.widget.Button[@resource-id='com.sina.weibo:id/bnLogin']").click();
                Thread.sleep(5000);

            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }

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
