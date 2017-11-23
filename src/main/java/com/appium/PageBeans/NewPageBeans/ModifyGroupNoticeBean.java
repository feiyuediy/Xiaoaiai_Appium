package com.appium.PageBeans.NewPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class ModifyGroupNoticeBean extends BaseBean{


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
    @Description(description="群公告")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="提交")
    public  PlainText  submit;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="提交")
    public  PlainText  edit;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agn_vip_image']"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agn_image']"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/agn_notice_name']"})
    @Description(description="asd1")
    public  PlainText  notice_name;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/agn_notice_time']"})
    @Description(description="2017-07-13 11:33")
    public  PlainText  notice_time;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/agn_divide_line']"})
    @Description(description="")
    public  View  view7;


    @Xpath(xpath={"//android.widget.ScrollView"})
    @Description(description="")
    public  View  scrollView8;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/agn_notice_content']"})
    @Description(description="")
    public  Text  notice_content;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="")
    public  PlainText  dialog_btn_ok;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="")
    public  PlainText  dialog_btn_submit;

    public ModifyGroupNoticeBean(AppiumDriver aDriver){super(aDriver);}

}