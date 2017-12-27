package com.appium.Pages.MinePage;

import com.appium.PageBeans.MinePageBeans.UserInfoBean;
import com.appium.Pages.MinePage.MinePage;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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
        DriverCommon.goSleep(1);
        String id = "com.zkj.guimi:id/vii_tv_content";
        List<WebElement> list = appiumDriver.findElementsById(id);
        return list.get(0).getText();
//        return userInfoBean.userNick.getText();
    }
    //获取用户的爱爱号
    public String getAiaiNum(){
        return userInfoBean.aiaiNum.getText();
    }
    public void click_back(){
        userInfoBean.back.click();
    }

    //h获取爱爱豆
    public String get_aiaidou_num(){
        return userInfoBean.aiaidou.getText();
    }

}
