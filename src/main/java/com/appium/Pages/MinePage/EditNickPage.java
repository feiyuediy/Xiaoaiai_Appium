package com.appium.Pages.MinePage;

import com.appium.PageBeans.MinePageBeans.EditUserNameBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/8/30.
 */
public class EditNickPage {
    private EditUserNameBean editUserNameBean;
    private AppiumDriver appiumDriver;

    public EditNickPage(AppiumDriver appiumDriver1){
        appiumDriver = appiumDriver1;
        editUserNameBean = new EditUserNameBean(appiumDriver);
    }
    //修改用户昵称
    public void EditNickName(String nickName){
        editUserNameBean.nickName.clear();
        editUserNameBean.nickName.input(nickName);
        editUserNameBean.save.click();
        editUserNameBean.back.click();
    }

}
