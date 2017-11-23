package com.appium.Pages.MinePage;

import com.appium.PageBeans.MinePageBeans.AccountInfoBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/8/30.
 */
public class AccountInfoPage {
    private AppiumDriver appiumDriver;
    private AccountInfoBean accountInfoBean;


    public AccountInfoPage(AppiumDriver appiumDriver1){
        appiumDriver = appiumDriver1;
        accountInfoBean = new AccountInfoBean(appiumDriver);
    }

    public void goback(){
        accountInfoBean.goBack.click();
    }
    public void gotoEditPage(){
        accountInfoBean.Edit.click();
    }
    public String get_nick(){
        return accountInfoBean.title.getText();
    }
}
