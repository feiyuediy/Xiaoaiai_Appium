package com.appium.Pages.MinePage;

import com.appium.PageBeans.MinePageBeans.SettingBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/1.
 */
public class SettingPage {
    private SettingBean settingBean;
    private AppiumDriver appiumDriver;

    public SettingPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        settingBean = new SettingBean(this.appiumDriver);
    }
    //點擊退出登錄
    public void click_quitLogin(){
        settingBean.quit.click();
    }
}
