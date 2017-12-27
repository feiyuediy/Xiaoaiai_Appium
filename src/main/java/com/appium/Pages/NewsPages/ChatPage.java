package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.ChatBean;
import com.appium.Pages.AccostPages.PhotoSelectPage;
import com.appium.Utils.Common;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

/**
 * Created by admin on 2017/9/20.
 */
public class ChatPage {
    private ChatBean chatBean;
    private AppiumDriver appiumDriver;

    public ChatPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        chatBean = new ChatBean(appiumDriver);
    }

    //点击返回按钮
    public void click_back(){
        chatBean.back.click();
    }

    //点击资料按钮
    public void click_ziliao(){
        chatBean.data.click();
    }

    //获取最后一条发送信息的发送状态
    public boolean get_msg_status(){
        WebElement webElement = chatBean.chatList.toWebElement();
        List<WebElement> webElements = webElement.findElements(By.id("com.zkj.guimi:id/layout_msg"));
        int size = webElements.size();
        System.out.println(size);
        try{
            WebElement webElement1 = webElements.get(size-1);
            webElement1.findElement(By.id("com.zkj.guimi:id/msg_status"));
            return false;
        }catch (Exception e){
            return true;
        }
    }

    //获取第N条信息的文字
    public String get_msg(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String id = "com.zkj.guimi:id/tv_chatcontent";
        List<WebElement> webElements = appiumDriver.findElementsById(id);
        return webElements.get(i - 1).getText();
    }
    //发送文字
    public void send_txt(String txt){
        if (chatBean.btn_mode_text.isExists()){
            chatBean.btn_mode_text.click();
            chatBean.input_container.clear();
            chatBean.input_container.input(txt);
            chatBean.send.click();
        }else {
            chatBean.input_container.clear();
            chatBean.input_container.input(txt);
            chatBean.send.click();
        }
    }
    //发送语音
    public void send_voice(int i){
//        TouchAction touchAction = new TouchAction(appiumDriver);
        if (chatBean.btn_press_to_speak.isExists()){
            chatBean.btn_press_to_speak.click();
            DriverCommon.Hand_permission(appiumDriver);
            chatBean.btn_mode_voice.click();
//            appiumDriver.tap(1,chatBean.btn_press_to_speak.toWebElement(),i*1000);
            Duration duration = Duration.ofMillis(i);
            TouchAction touchAction = new TouchAction(appiumDriver);
            touchAction.longPress(chatBean.btn_press_to_speak.toWebElement()).waitAction(duration);

//            appiumDriver.tap(1,chatBean.btn_press_to_speak.toWebElement(),i*1000);
        }else {
            chatBean.btn_mode_voice.click();
            DriverCommon.Hand_permission(appiumDriver);
            Duration duration = Duration.ofMillis(i);
            TouchAction touchAction = new TouchAction(appiumDriver);
            touchAction.longPress(chatBean.btn_press_to_speak.toWebElement()).waitAction(duration);
//              touchAction.longPress(chatBean.btn_press_to_speak.toWebElement()).wait(i*1000);


        }
    }
    //发送表情
    public void send_emoj(){
        chatBean.send_emoj.click();
        chatBean.emoj.click();
        chatBean.send.click();
    }
    //发送图片
    public void send_pic(){
        chatBean.add_pic.click();
        DriverCommon.Hand_permission(appiumDriver);
        PhotoSelectPage photoSelectPage = new PhotoSelectPage(appiumDriver);
        photoSelectPage.select_photoByint(1);
    }
    //发送拍照
    public void send_crame(){

    }
    //发送小视频
    public void send_video(){

    }
    //发送阅后即焚
    public void send_brunAfterRead(){
        chatBean.add_BurnAfterReading.click();
        chatBean.dchi_tv_select_from_phone.click();

        PhotoSelectPage photoSelectPage = new PhotoSelectPage(appiumDriver);
        photoSelectPage.select_photoByint(1);
    }

    //发送礼包
    public void send_gift() throws InterruptedException {
        chatBean.add_gift.click();
        SendGiftPage sendGiftPage = new SendGiftPage(appiumDriver);
        sendGiftPage.selectGiftName("普通礼物 喜鹊翎毛");
        sendGiftPage.click_send();
        Thread.sleep(2000);
    }
    //点击语音
    public void click_btn_mode_voice(){
        chatBean.btn_mode_voice.click();
    }
}
