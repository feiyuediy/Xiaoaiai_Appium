package com.appium.PageBeans.DidiPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class DidiWaittingPageBean extends BaseBean{


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/adm_img_connect_left']"})
    @Description(description="")
    public  View  imageView1;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/adm_lottie_view']"})
    @Description(description="")
    public  View  imageView2;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/adm_img_connect_type']"})
    @Description(description="")
    public  View  imageView3;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/adm_img_connect_right']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/adm_tv_tips']"})
    @Description(description="??????...")
    public  PlainText  adm_tv_tips;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/adm_tv_time']"})
    @Description(description="00:12")
    public  PlainText  adm_tv_time;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/adm_tv_cancel']"})
    @Description(description="??")
    public  PlainText  adm_tv_cancel;


    public DidiWaittingPageBean(AppiumDriver aDriver){super(aDriver);}

}