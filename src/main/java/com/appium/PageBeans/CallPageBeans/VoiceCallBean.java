package com.appium.PageBeans.CallPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class VoiceCallBean extends BaseBean{


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/swing_card']"})
    @Description(description="")
    public  View  head;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avc_vip_img']"})
    @Description(description="")
    public  View  imageView2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_nick']"})
    @Description(description="23424234")
    public  PlainText  tv_nick;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/acv_scale_btn']"})
    @Description(description="")
    public  View  scale_btn;


    @Xpath(xpath={"//android.widget.Chronometer[@resource-id='com.zkj.guimi:id/chronometer']"})
    @Description(description="02:05")
    public  View  chronometer;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/iv_mute']"})
    @Description(description="")
    public  View  mute;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/avc_call_success_layout']/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="??")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avc_call_success_hangup']"})
    @Description(description="")
    public  View  hangup;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/avc_call_success_layout']/android.widget.LinearLayout[2]/android.widget.TextView[1]"})
    @Description(description="??")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/iv_handsfree']"})
    @Description(description="")
    public  View  handsfree;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/avc_call_success_layout']/android.widget.LinearLayout[3]/android.widget.TextView[1]"})
    @Description(description="??")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avc_header_bg_image']"})
    @Description(description="")
    public  View  imageView8;




    public VoiceCallBean(AppiumDriver aDriver){super(aDriver);}

}