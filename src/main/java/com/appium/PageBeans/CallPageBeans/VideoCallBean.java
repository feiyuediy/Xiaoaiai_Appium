package com.appium.PageBeans.CallPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class VideoCallBean extends BaseBean{


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/acv_scale_btn']"})
    @Description(description="")
    public  View  acv_scale_btn;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/local_surface']"})
    @Description(description="")
    public  View  local_surface;


    @Xpath(xpath={"//android.widget.Chronometer[@resource-id='com.zkj.guimi:id/chronometer']"})
    @Description(description="01:29")
    public  View  chronometer;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/img_refuse_handup']"})
    @Description(description="")
    public  View  img_refuse_handup;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/avc_call_success_layout']/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="??")
    public  PlainText  textView1;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/video_change']"})
    @Description(description="")
    public  View  video_change;


    @Xpath(xpath={"//android.widget.TextView[@text='?????']"})
    @Description(description="?????")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/video_beauty']"})
    @Description(description="")
    public  View  video_beauty;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/avc_call_success_layout']/android.widget.LinearLayout[3]/android.widget.TextView[1]"})
    @Description(description="??")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/opposite_surface']"})
    @Description(description="")
    public  View  view7;




    public VideoCallBean(AppiumDriver aDriver){super(aDriver);}

}