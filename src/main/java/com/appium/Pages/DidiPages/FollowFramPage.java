package com.appium.Pages.DidiPages;

import com.appium.PageBeans.DidiPageBeans.FollowFramPageBean;
import io.appium.java_client.AppiumDriver;

public class FollowFramPage {
    private AppiumDriver appiumDriver;
    private FollowFramPageBean followFramPageBean;

    public FollowFramPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        followFramPageBean = new FollowFramPageBean(appiumDriver);
    }

    public String get_nick(){
        return followFramPageBean.nickName.getText();
    }

    public void click_viewData(){
        System.out.println("点击查看资料");
        followFramPageBean.ViewData.click();
    }


}
