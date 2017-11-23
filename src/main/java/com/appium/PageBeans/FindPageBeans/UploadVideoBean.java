package com.appium.PageBeans.FindPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class UploadVideoBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.VideoView"})
    @Description(description="")
    public  View  videoView2;


    @Xpath(xpath={"//android.widget.ScrollView"})
    @Description(description="")
    public  View  scrollView3;


    @Xpath(xpath={"//android.widget.FrameLayout[@resource-id='com.zkj.guimi:id/video']/android.view.View[1]"})
    @Description(description="")
    public  View  view4;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/asp_et_video_content']"})
    @Description(description="说点什么吧...")
    public  Text  video_content;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/asp_root_view']/android.view.View[1]"})
    @Description(description="")
    public  View  view5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/asp_tv_back']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/asp_layout_bottom']/android.view.View[1]"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/asp_img_mix_music']"})
    @Description(description="")
    public  View  mix_music;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/asp_layout_bottom']/android.view.View[2]"})
    @Description(description="")
    public  View  view8;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/asp_img_cut']"})
    @Description(description="")
    public  View  img_cut;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/asp_layout_bottom']/android.view.View[3]"})
    @Description(description="")
    public  View  view10;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/asp_tv_upload']"})
    @Description(description="上传")
    public  PlainText  upload;

    @Xpath(xpath={"//android.widget.ProgressBar[@resource-id='com.zkj.guimi:id/dialog_progressbar']"})
    @Description(description="上传进度条")
    public  PlainText  dialog_progressbar;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dc_dialog_txt_content']"})
    @Description(description="")
    public  PlainText  dc_dialog_txt_content;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="")
    public  PlainText  dc_dialog_btn_ok;


    public UploadVideoBean(AppiumDriver aDriver){super(aDriver);}

}