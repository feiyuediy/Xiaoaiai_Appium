package com.appium.Pages.CallPages;

import com.appium.PageBeans.CallPageBeans.DialingCallPageBean;
import io.appium.java_client.AppiumDriver;

public class DialingCallPage {
    private AppiumDriver appiumDriver;
    private DialingCallPageBean dialingCallPageBean;

    public DialingCallPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        dialingCallPageBean = new DialingCallPageBean(appiumDriver);
    }

    //获取被叫人的nick
    public String get_nick(){
        return dialingCallPageBean.tv_nick.getText();
    }

    //点击挂断按钮
    public void click_hangup(){
        dialingCallPageBean.btn_hangup_call.click();
    }
}
