package com.appium.PageBeans.FindPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class RecordVideoBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view11;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/preview']"})
    @Description(description="")
    public  View  view22;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ar_img_close']"})
    @Description(description="")
    public  View  close;


    @Xpath(xpath={"//android.widget.ImageButton[@resource-id='com.zkj.guimi:id/switch_camera']"})
    @Description(description="")
    public  View  switch_camera;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/delete']"})
    @Description(description="")
    public  View  delete;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/ar_layout_bottom_btn']/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ar_img_open_folder']"})
    @Description(description="")
    public  View  open_folder;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[2]"})
    @Description(description="")
    public  View  view8;


    @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/record']"})
    @Description(description="")
    public  View  record;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[3]"})
    @Description(description="")
    public  View  view10;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ar_img_hx_effect']"})
    @Description(description="")
    public  View  hx_effect;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[4]"})
    @Description(description="")
    public  View  view12;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/concat']"})
    @Description(description="")
    public  View  concat;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/record_progressbar']"})
    @Description(description="")
    public  View  record_progressbar;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dc_dialog_txt_content']"})
    @Description(description="您正在录制视频， 是否放弃录制？")
    public  PlainText  dialog_content;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_cancel']"})
    @Description(description="取消")
    public  Click  dialog_cancel;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/dc_dialog_view_line_v']"})
    @Description(description="")
    public  View  view2;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="确定")
    public  Click  dialog_ok;


    public RecordVideoBean(AppiumDriver aDriver){super(aDriver);}

}