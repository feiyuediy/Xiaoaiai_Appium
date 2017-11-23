package com.appium.Pages.MinePage;

import com.appium.PageBeans.MinePageBeans.OtherUserInfoPageBean;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OtherUserInfoPage {
    private AppiumDriver appiumDriver;
    private OtherUserInfoPageBean otherUserInfoPageBean;

    public OtherUserInfoPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        otherUserInfoPageBean = new OtherUserInfoPageBean(appiumDriver);
    }

    //获取title
    public String get_title(){
        return otherUserInfoPageBean.title.getText();
    }

    //点击返回按钮
    public void click_back(){
        otherUserInfoPageBean.back.click();
    }

    //点击取消拉黑或者是拉黑操作
    public void backOrUnback(){

        if (isBack()){
            otherUserInfoPageBean.iuo_tv_black.click();
            otherUserInfoPageBean.dialog_btn_ok.click();
        }else {
            otherUserInfoPageBean.iuo_tv_black.click();
            otherUserInfoPageBean.ban_person.click();
        }
    }

    //判断是否拉黑了这个人
    public boolean isBack(){
        String st = otherUserInfoPageBean.iuo_tv_black.getText();
        if (st.equals("取消拉黑")){
            return true;
        }else {
            return false;
        }
    }

    //拉黑此人
    public void back(){
        if (isBack()){
            System.out.println("此人已经被拉黑");
        }else {
            otherUserInfoPageBean.back.click();
            otherUserInfoPageBean.ban_person.click();
        }
    }
    //关注此人
    public void attention(){
        try{
            otherUserInfoPageBean.img_favourite.click();
            otherUserInfoPageBean.dg_btn_confirm.click();
        }catch (Exception e){
            otherUserInfoPageBean.img_favourite.click();
        }
    }

    //点击聊天按钮
    public void click_chatButton(){
        otherUserInfoPageBean.chat_button.click();
    }

    //点击视频--语音通话
    public void click_voiceCall(){
        WebElement video_button = otherUserInfoPageBean.video_button_frame.toWebElement();
        int height = video_button.getSize().height;
        int width = video_button.getSize().width;
        int x = video_button.getLocation().getX();
        int y = video_button.getLocation().getY();

        otherUserInfoPageBean.video_button.click();
        System.out.println("x:"+String.valueOf(x+width/2));
        System.out.println("y:"+String.valueOf(y-height/2));

        TouchAction action = new TouchAction(appiumDriver);
        action.tap(x+(width)/2,y-height/2).perform();
    }

    //点击视频--视频通话
    public void click_videoCall(){
        WebElement video_button = otherUserInfoPageBean.video_button.toWebElement();
        int height = video_button.getSize().height;
        int width = video_button.getSize().width;
        int x = video_button.getLocation().getX();
        int y = video_button.getLocation().getY();

        otherUserInfoPageBean.video_button.click();

        TouchAction action = new TouchAction(appiumDriver);
        action.tap(x+(width)/2,y-height*3/2).perform();
    }
}
