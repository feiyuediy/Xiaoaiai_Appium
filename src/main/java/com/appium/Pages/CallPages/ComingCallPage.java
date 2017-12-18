package com.appium.Pages.CallPages;

import com.appium.PageBeans.CallPageBeans.ComingCallBean;
import io.appium.java_client.AppiumDriver;

public class ComingCallPage {
    private AppiumDriver appiumDriver;
    private ComingCallBean comingCallBean;

    public ComingCallPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        comingCallBean = new ComingCallBean(appiumDriver);
    }

    //点击拒绝
    public void click_resufe(){
        comingCallBean.refuse_call.click();
    }

    //点击接受
    public void click_answer(){
        comingCallBean.answer_call.expectElementExistOrNot(true,30000);
        comingCallBean.answer_call.click();
    }

    //获取状态的文字
    public String get_state_txt(){
        return comingCallBean.call_state.getText();
    }

    //获取对方姓名
    public String get_nick(){
        return comingCallBean.tv_nick.getText();
    }
}
