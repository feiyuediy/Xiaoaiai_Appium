package com.appium.Pages.AccostPages;

import com.appium.PageBeans.AccostPageBeans.ChartBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/5.
 */
public class ChartPage {
    private ChartBean chartBean;
    private AppiumDriver appiumDriver;

    public ChartPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        chartBean = new ChartBean(appiumDriver);
    }
    //判断banner图是否存在
    public boolean isExitBanner(){
        return chartBean.banner.isExists();
    }
}
