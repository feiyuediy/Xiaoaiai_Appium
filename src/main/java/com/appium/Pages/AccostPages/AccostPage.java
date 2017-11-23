package com.appium.Pages.AccostPages;

import com.appium.PageBeans.AccostPageBeans.AccostBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/8/29.
 */
public class AccostPage {
    private String activity = ".ui.MainActivity";
    private AppiumDriver appiumDriver;
    private AccostBean accostBean;
    public AccostPage(AppiumDriver appiumDriver1){
        appiumDriver = appiumDriver1;
        accostBean = new AccostBean(appiumDriver);
    }
    public void gotoMine(){
        accostBean.mine.click();
    }
    public void gotoMood(){accostBean.mood.click();}
    public void gotoFind(){
        accostBean.find.click();
    }
    public void gotoNews(){
        accostBean.news.click();
    }
    public void gotoDIdi(){accostBean.didi.click();}
}
