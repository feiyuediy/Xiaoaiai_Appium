package com.appium.Pages.CallPages;

import com.appium.PageBeans.CallPageBeans.VoiceCallBean;
import io.appium.java_client.AppiumDriver;

public class VoiceCallPaeg {
    private AppiumDriver appiumDriver;
    private VoiceCallBean voiceCallBean;

    public VoiceCallPaeg(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        voiceCallBean = new VoiceCallBean(appiumDriver);
    }

    //点击静音
    public void click_mute(){
        voiceCallBean.mute.click();
    }

    //点击挂断
    public void click_hangup(){
        voiceCallBean.hangup.click();
    }

    //获取对方昵称
    public String get_nick(){
        return voiceCallBean.tv_nick.getText();
    }

}
