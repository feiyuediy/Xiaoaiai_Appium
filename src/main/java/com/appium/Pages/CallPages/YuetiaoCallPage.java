package com.appium.Pages.CallPages;

import com.appium.PageBeans.CallPageBeans.YuetiaoCallPageBean;
import io.appium.java_client.AppiumDriver;

public class YuetiaoCallPage {
    private AppiumDriver appiumDriver;
    private YuetiaoCallPageBean yuetiaoCallPageBean;

    public YuetiaoCallPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        yuetiaoCallPageBean = new YuetiaoCallPageBean(appiumDriver);
    }

    //点击设备弹窗中的取消按钮
    public void click_device_dialog_cancle(){
        yuetiaoCallPageBean.dialog_btn_cancel.click();
    }

    //点击设备弹窗中的确定按钮
    public void click_device_dialog_ok(){
        yuetiaoCallPageBean.dialog_btn_ok.click();
    }

    //点击断开按钮
    public void click_close(){
        yuetiaoCallPageBean.close.click();
    }

    //点击链接已关闭中的我按钮
    public void click_close_dialog_ok(){
        yuetiaoCallPageBean.dc_dialog_btn_ok.click();
    }

    //点击真的要狠心离开中的离开按钮
    public void click_dialog_ok(){
        yuetiaoCallPageBean.dc_dialog_btn_ok.click();
    }
}
