package com.appium.Pages.LoginPages;

import com.appium.PageBeans.LoginPageBeans.QQloginBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/4.
 */
public class QQloginPage {
    private QQloginBean qQloginBean;
    private AppiumDriver appiumDriver;

    public QQloginPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
    }

    public void click_login(){
        qQloginBean.qqLogin.click();
    }
}
