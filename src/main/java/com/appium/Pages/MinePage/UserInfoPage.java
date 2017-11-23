package com.appium.Pages.MinePage;

import com.appium.PageBeans.MinePageBeans.UserInfoBean;
import com.appium.Pages.MinePage.MinePage;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/8/30.
 */
public class UserInfoPage {
    private AppiumDriver appiumDriver;
    private UserInfoBean userInfoBean;

    public UserInfoPage(AppiumDriver appiumDriver1){
        appiumDriver = appiumDriver1;
        userInfoBean = new UserInfoBean(appiumDriver);
    }

    //进入修改头像页面
    public void goEditHead(){
        userInfoBean.headImage.click();
    }
    //进入修改ID照
    public void goEditIdPhotoPage(){
        userInfoBean.idPhoto.click();
    }
    //进入修改用户昵称
    public void goEditUserNickPage(){
        userInfoBean.userNickTable.click();
    }
    //修改用户昵称
    public void EditUserNickName(String nickName){
        goEditUserNickPage();
        EditNickPage editNickPage = new EditNickPage(appiumDriver);
        editNickPage.EditNickName(nickName);
    }
    //获取用户昵称
    public String getNickName(){
        return userInfoBean.userNick.getText();
    }
    //获取用户的爱爱号
    public String getAiaiNum(){
        return userInfoBean.aiaiNum.getText();
    }
    public void click_back(){
        userInfoBean.back.click();
    }
}
