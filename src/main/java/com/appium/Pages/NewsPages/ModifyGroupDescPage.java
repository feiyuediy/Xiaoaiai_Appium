package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.ModifyGroupDescBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/21.
 */
public class ModifyGroupDescPage {
    private AppiumDriver appiumDriver;
    private ModifyGroupDescBean modifyGroupDescBean;

    public ModifyGroupDescPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        modifyGroupDescBean = new ModifyGroupDescBean(appiumDriver);
    }

    //修改群介绍
    public void modifyGroupDesc(String desc){
        modifyGroupDescBean.et_desc.clear();
        modifyGroupDescBean.et_desc.input(desc);
        modifyGroupDescBean.submit.click();
        modifyGroupDescBean.dialog_btn_ok.click();
        modifyGroupDescBean.back.click();
    }
}
