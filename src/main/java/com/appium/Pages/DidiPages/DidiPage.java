package com.appium.Pages.DidiPages;

import com.appium.PageBeans.DidiPageBeans.DidiPageBean;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

import java.time.Duration;

public class DidiPage {
    private AppiumDriver appiumDriver;
    private DidiPageBean didiPageBean;

    public DidiPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        didiPageBean = new DidiPageBean(appiumDriver);
    }

    //点击接单按钮
    public void click_orderTake(){
        didiPageBean.orderTake.click();
    }

    //点击帮助按钮
    public void click_help(){
        didiPageBean.help.click();
    }

    //点击互粉tab
    public void click_fllow(){
        didiPageBean.flow.click();
    }

    //点击语音tab
    public void click_voice(){
        didiPageBean.voice.click();
    }

    //点击视频tab
    public void click_video(){
        didiPageBean.video.click();
    }

    //创建didi订单_视频
    public void creat_didi_video(){
        click_video();
        didiPageBean.di.click();
        try{
            DriverCommon.Hand_permission(appiumDriver);
            DriverCommon.Hand_permission(appiumDriver);
            DriverCommon.Hand_permission(appiumDriver);
            click_di();
        }catch (Exception e){
            didiPageBean.dialog_ok.click();
        }

    }

    //点击约跳tab
    public void click_yuetiao(){
        didiPageBean.yuetiao.click();
    }

    //点击滴一下
    public void click_di(){
        didiPageBean.di.click();
        try{
            didiPageBean.dialog_ok.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //点击捎话
    public void click_takeMsg(){
        didiPageBean.takeMessage.click();
    }

    //设置捎话
    public void set_msg(String msg){
        click_takeMsg();
        TakeMsgPage takeMsgPage = new TakeMsgPage(appiumDriver);
        takeMsgPage.set_msg_txt(msg);
        takeMsgPage.click_sure();
    }

    //设置额外打赏
    public void set_reward(){
        didiPageBean.reward.click();
        int width = appiumDriver.manage().window().getSize().width;
        int height = appiumDriver.manage().window().getSize().height;
        Duration duration=Duration.ofSeconds(1);
        TouchAction action1 = new TouchAction(appiumDriver).press(width / 2, height * 8 / 9).waitAction(duration).moveTo(width / 2, height *15/ 18).release();
        action1.perform();
//        appiumDriver.swipe(width / 2, height * 8 / 9, width / 2, height *15/ 18,2000);

        didiPageBean.reward_ok.click();
    }

    //获取打赏
    public String get_reward(){
        return didiPageBean.reward.getText();
    }

    //获取捎话
    public String get_takeMsg(){
        return didiPageBean.msg.getText();
    }

    //获取互粉的价格
    public String get_follow_price(){
        return didiPageBean.price.getText();
    }

    //获取互粉等级筛选
    public String get_follow_level(){
        return didiPageBean.levlePick.getText();
    }

    //创建didi互粉订单
    public void creat_diid_follow(){
        click_fllow();
        didiPageBean.di.click();
    }
}
