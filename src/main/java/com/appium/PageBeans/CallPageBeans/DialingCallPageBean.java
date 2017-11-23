package com.appium.PageBeans.CallPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class DialingCallPageBean extends BaseBean{


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/swing_card']"})
    @Description(description="")
    public  View  swing_card;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avc_vip_img']"})
    @Description(description="")
    public  View  avc_vip_img;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_nick']"})
    @Description(description="23424234")
    public  PlainText  tv_nick;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_call_state']"})
    @Description(description="??????????...")
    public  PlainText  tv_call_state;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/btn_hangup_call']"})
    @Description(description="")
    public  View  btn_hangup_call;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/btn_hangup_call_tv']"})
    @Description(description="??")
    public  PlainText  btn_hangup_call_tv;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avc_header_bg_image']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/opposite_surface']"})
    @Description(description="")
    public  View  view5;




    public DialingCallPageBean(AppiumDriver aDriver){super(aDriver);}

}