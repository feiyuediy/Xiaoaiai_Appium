package com.appium.Pages.CallPages;

import com.appium.PageBeans.CallPageBeans.VideoCallBean;
import io.appium.java_client.AppiumDriver;

public class VidelCallPage {
    private AppiumDriver appiumDriver;
    private VideoCallBean videoCallBean;

    public VidelCallPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        videoCallBean = new VideoCallBean(appiumDriver);
    }

    //点击悬浮按钮
    public void click_scale_btn(){
        videoCallBean.acv_scale_btn.click();
    }

    //点击挂断按钮
    public void click_refuse(){
        videoCallBean.img_refuse_handup.click();
    }
}
