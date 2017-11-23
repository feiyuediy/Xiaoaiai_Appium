package com.appium.Pages.LoginPages;

import com.appium.PageBeans.LoginPageBeans.StarupBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/8/29.
 */
public class StartupPage {
    private AppiumDriver appiumDriver;
    private StarupBean starupBean;

    public StartupPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        StarupBean starupBean = new StarupBean(appiumDriver);
    }
    public void click_regist(){
        starupBean.regist.click();
    }
    public void click_login(){
        starupBean.login.click();
    }
}
