package com.appium.Pages.AccostPages;

import com.appium.PageBeans.AccostPageBeans.EditMoodBean;
import com.appium.PageBeans.AccostPageBeans.MoodBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/4.
 */
public class MoodPage {
    private MoodBean moodBean;
    private AppiumDriver appiumDriver;

    public MoodPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        this.moodBean = new MoodBean(appiumDriver);
    }

    //获取刷选项文字
    public String getScreenText(){
        return moodBean.screen.getText();
    }
    //切换刷选
    public void changeScreen(String screen){
        moodBean.screen.click();
        switch (screen){

            case "女":
                moodBean.onlyGril.click();
                break;
            case "男":
                moodBean.onlyboy.click();
                break;
        }
    }

    public void setMyPlaintext(String[] xpath,String description){
        moodBean.myPlaintext.setXpath(xpath);
        moodBean.myPlaintext.setDescription(description);
    }
    public void click_head(int i){
        String[] xpath = {"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"};
        System.out.println("xpath:"+xpath[0]);
        setMyPlaintext(xpath,"头像");
        moodBean.myPlaintext.click();
    }
    //点击编辑按钮
    public void click_edit(){
        moodBean.edit.click();
    }
    //发布心情
    public void editMood(String mood){
        click_edit();
        EditMoodBean editMoodBean = new EditMoodBean(appiumDriver);
        editMoodBean.editText1.input(mood);
        editMoodBean.save.click();
    }
    //获取自己的心情
    public String getMyMood(){
        return moodBean.myMood.getText();
    }

    //检查等级标签是否存在
    public boolean getLevilTag(){
        String[] xpath = {"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"};
        moodBean.myPlaintext.setXpath(xpath);
        return moodBean.myPlaintext.isExists();
    }
    //检查性别标签是否存在
    public boolean getSexTag(){
        String[] xpath = {"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"};
        moodBean.myPlaintext.setXpath(xpath);
        return moodBean.myPlaintext.isExists();
    }
    //检查魅力值标签是否存在
    public boolean getChaneTag(){
        String[] xpath = {"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"};
        moodBean.myPlaintext.setXpath(xpath);
        return moodBean.myPlaintext.isExists();
    }
    //检查设备标签是否存在
    public boolean getdeviceTag(){
        String[] xpath = {"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[2]"};
        moodBean.myPlaintext.setXpath(xpath);
        return moodBean.myPlaintext.isExists();
    }

    //点击关注弹窗中的我知道了
    public void click_ok(){
        moodBean.ok.click();
    }
}
