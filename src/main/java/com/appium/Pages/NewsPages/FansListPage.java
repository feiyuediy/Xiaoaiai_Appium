package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.AttentionListPageBean;
import io.appium.java_client.AppiumDriver;

public class FansListPage {
    private AppiumDriver appiumDriver;
    private AttentionListPageBean attentionListPageBean;

    public FansListPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        attentionListPageBean = new AttentionListPageBean(appiumDriver);
    }

    //点击返回按钮
    public void click_back(){
        attentionListPageBean.back.click();
    }

    //获取第一个人的nick
    public String get_frist_nick(){
        return attentionListPageBean.name.getText();
    }

    //点击第一个人
    public void click_nick(){
        attentionListPageBean.name.click();
    }
}
