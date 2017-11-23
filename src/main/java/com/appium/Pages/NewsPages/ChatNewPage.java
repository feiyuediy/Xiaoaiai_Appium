package com.appium.Pages.NewsPages;

import com.appium.PageBeans.AccostPageBeans.ChartBean;
import com.appium.PageBeans.NewPageBeans.ChatNewBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/15.
 */
public class ChatNewPage {
    private AppiumDriver appiumDriver;
    private ChatNewBean chatNewBean;

    public ChatNewPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        chatNewBean = new ChatNewBean(appiumDriver);
    }
    //跳转到聊天消息
    public void click_chatNew(){
        chatNewBean.chatmsg.click();
    }
    //跳弹到群组页面
    public void click_group(){
        chatNewBean.group.click();
    }
    //跳转到联系人
    public void click_contacts(){
        chatNewBean.contacts.click();
    }
    //点击搭讪
    public void gotoAssc(){
        chatNewBean.accoston.click();
    }
    //点击发现
    public void gotoFind(){
        chatNewBean.find.click();
    }
    //点击约跳
    public void gotoYueTiao(){
        chatNewBean.yuetiao.click();
    }
    //点击我的
    public void gotoMine(){
        chatNewBean.mime.click();
    }
    //长按第一个消息联系人的名称
    public void tapFrist(){
        appiumDriver.tap(1,chatNewBean.fristName.toWebElement(),2000);
    }

    //删除一个人的聊天记录
    public void delectChat(){
        tapFrist();
        chatNewBean.delectChat.click();
    }

    //点击第一个聊天消息
    public void click_frist_new(){
        chatNewBean.fristName.click();
    }
    //点击title
    public void click_timestamp(){
        chatNewBean.timestamp.click();
    }
}
