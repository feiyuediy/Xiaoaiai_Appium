package com.appium.PageBeans.DidiPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class OrderFrameBean extends BaseBean{


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dd_tv_nickname']"})
    @Description(description="23424234")
    public  PlainText  passengerName;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/dd_img_type']"})
    @Description(description="")
    public  View  imageView1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dd_tv_didi_fee']"})
    @Description(description="  10爱爱豆/分钟")
    public  PlainText  didi_fee;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view2;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_cancel']"})
    @Description(description="忽略")
    public  Click  refuse;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/dc_dialog_view_line_v']"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="快速接收")
    public  Click  accept;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/laag_header']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/laag_gender']"})
    @Description(description="")
    public  View  imageView5;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dd_tv_msg_by_sender']"})
    @Description(description="")
    public  View  msg_by_sender;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dd_tv_didi_ext']"})
    @Description(description="")
    public  View  reward_by_sender;


    public OrderFrameBean(AppiumDriver aDriver){super(aDriver);}

}