package com.appium.PageBeans.FindPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class LoadVideoBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/action_bar_overlay_layout']"})
    @Description(description="")
    public  View  view2;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/action_bar']"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="视频")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  icon_left;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="取消")
    public  PlainText  cancle;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']"})
    @Description(description="")
    public  View  gridView5;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  fristVideo;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/chatting_length_iv' and @text='00:06']"})
    @Description(description="00:06")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  seccVideo;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/chatting_length_iv' and @text='00:23']"})
    @Description(description="00:23")
    public  PlainText  textView5;

    @Xpath(xpath={""})
    @Description(description="")
    public  PlainText  time;

    //android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.GridView[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]
    public LoadVideoBean(AppiumDriver aDriver){super(aDriver);}

}