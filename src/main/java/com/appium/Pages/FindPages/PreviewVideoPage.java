package com.appium.Pages.FindPages;

import com.appium.PageBeans.FindPageBeans.PreviewVideoBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/7.
 */
public class PreviewVideoPage {
    private PreviewVideoBean previewVideoBean;
    private AppiumDriver appiumDriver;

    public PreviewVideoPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        previewVideoBean = new PreviewVideoBean(appiumDriver);
    }

    public void click_sure(){
        previewVideoBean.sure.click();
    }

    public void click_back(){
        previewVideoBean.back.click();
    }

    public void click_play(){
        previewVideoBean.play.click();
    }
}
