package com.appium.Pages.DidiPages;

import com.appium.PageBeans.DidiPageBeans.OrderFrameBean;
import io.appium.java_client.AppiumDriver;

public class OrderFrame {
    private AppiumDriver appiumDriver;
    private OrderFrameBean orderFrameBean;

    public OrderFrame(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        orderFrameBean = new OrderFrameBean(appiumDriver);
    }

    //获取乘客姓名
    public String getPassengerName(){
        return orderFrameBean.passengerName.getText();
    }

    //获取价格
    public String getFree(){
        return orderFrameBean.didi_fee.getText();
    }

    //拒绝
    public void click_refuse(){
        orderFrameBean.refuse.click();
    }

    //接受
    public void click_accept(){
        orderFrameBean.accept.expectElementExistOrNot(true,30000);
        orderFrameBean.accept.click();
    }

    //获取捎话
    public String get_msg_by_send(){
        return orderFrameBean.msg_by_sender.getText();
    }

    //获取额外打赏
    public String get_reward_by_send(){
        orderFrameBean.reward_by_sender.expectElementExistOrNot(true,30000);
        return orderFrameBean.reward_by_sender.getText();
    }
}
