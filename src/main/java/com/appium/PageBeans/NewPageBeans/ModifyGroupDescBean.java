package com.appium.PageBeans.NewPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class ModifyGroupDescBean extends BaseBean{


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
    @Description(description="群介绍")
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


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/aegd_et_desc']"})
    @Description(description="德玛西亚之")
    public  Text  et_desc;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/aegd_tv_length']"})
    @Description(description="5/50")
    public  PlainText  tv_length;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="")
    public  PlainText  dialog_btn_ok;

    public ModifyGroupDescBean(AppiumDriver aDriver){super(aDriver);}

}