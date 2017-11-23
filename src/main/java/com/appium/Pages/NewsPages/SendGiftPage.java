package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.SendGiftBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/20.
 */
public class SendGiftPage {
    private SendGiftBean sendGiftBean;
    private AppiumDriver appiumDriver;

    public SendGiftPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        sendGiftBean = new SendGiftBean(appiumDriver);
    }

    //点击返回
    public void clcik_back(){
        sendGiftBean.back.click();
    }
    //点击说明
    public void click_explanation(){
        sendGiftBean.explanation.click();
    }

    //选择礼物
    public void selectGiftName(String giftName){
        String[] xpath  = {"//android.widget.TextView[@text='"+giftName+"']"};
        String desc = giftName;
        sendGiftBean.gift.setXpath(xpath);
        sendGiftBean.gift.setDescription(desc);

        sendGiftBean.name.click();
        sendGiftBean.gift.click();
    }
    //设置礼物总数
    public void setGiftNum(String giftNum){
        sendGiftBean.gift_num.clear();
        sendGiftBean.gift_num.input(giftNum);
    }

    //设置礼包个数
    public void setpackNum(String packNum){
        sendGiftBean.pack_num.clear();
        sendGiftBean.pack_num.input(packNum);
    }
    //设置描述
    public void setDesc(String desc){
        sendGiftBean.desc.input(desc);
    }

    //点击发送按钮
    public void click_send(){
        sendGiftBean.send.click();
    }
}
