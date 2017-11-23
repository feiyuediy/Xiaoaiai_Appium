package com.appium.Pages.DidiPages;

import com.appium.PageBeans.DidiPageBeans.TakeMsgPageBean;
import io.appium.java_client.AppiumDriver;

public class TakeMsgPage {
    private AppiumDriver appiumDriver;
    private TakeMsgPageBean takeMsgPageBean;

    public TakeMsgPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        takeMsgPageBean = new TakeMsgPageBean(appiumDriver);
    }

    public void click_back(){
        takeMsgPageBean.back.click();
    }

    public void click_sure(){
        takeMsgPageBean.sure.click();
    }

    //设置捎话内容
    public void set_msg_txt(String msg){
        takeMsgPageBean.editText1.clear();
        takeMsgPageBean.editText1.input(msg);
    }
}
