package com.appium.Pages.DidiPages;

import com.appium.PageBeans.DidiPageBeans.DidiWaittingPageBean;
import io.appium.java_client.AppiumDriver;

public class DidiWaittingPage {
    private AppiumDriver appiumDriver;
    private DidiWaittingPageBean didiWaittingPageBean;

    public DidiWaittingPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        didiWaittingPageBean = new DidiWaittingPageBean(appiumDriver);
    }

    //获取等待的文字
    public String get_tv_tips(){
        return didiWaittingPageBean.adm_tv_tips.getText();
    }

    //获取等待时间
    public String get_tv_time(){
        return didiWaittingPageBean.adm_tv_time.getText();
    }

    //点击取消按钮
    public void click_cancel(){
        didiWaittingPageBean.adm_tv_cancel.click();
    }
}
