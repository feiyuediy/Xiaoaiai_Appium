package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.ModifyGroupNameBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/21.
 */
public class ModifyGroupNamePage {
    private AppiumDriver appiumDriver;
    private ModifyGroupNameBean modifyGroupNameBean;

    public ModifyGroupNamePage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        modifyGroupNameBean = new ModifyGroupNameBean(appiumDriver);
    }

    //修改名称
    public void modify_group_name(String txt){
        modifyGroupNameBean.et_name.clear();
        modifyGroupNameBean.et_name.input(txt);
        modifyGroupNameBean.submit.click();
        modifyGroupNameBean.dialog_btn_ok.click();
        modifyGroupNameBean.back.click();
    }
}
