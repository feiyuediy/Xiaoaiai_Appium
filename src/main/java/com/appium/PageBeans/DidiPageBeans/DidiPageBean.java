package com.appium.PageBeans.DidiPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class DidiPageBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="DIDI")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="接单")
    public  PlainText  orderTake;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="帮助")
    public  PlainText  help;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right_3']"})
    @Description(description="")
    public  View  imageView2;


    @Xpath(xpath={"//android.widget.HorizontalScrollView[@resource-id='com.zkj.guimi:id/fd_table']"})
    @Description(description="")
    public  View  horizontalScrollView3;


    @Xpath(xpath={"//android.widget.TextView[@text='互粉']"})
    @Description(description="互粉")
    public  PlainText  flow;


    @Xpath(xpath={"//android.widget.TextView[@text='语音']"})
    @Description(description="语音")
    public  PlainText  voice;


    @Xpath(xpath={"//android.widget.TextView[@text='视频']"})
    @Description(description="视频")
    public  PlainText  video;


    @Xpath(xpath={"//android.widget.TextView[@text='约跳']"})
    @Description(description="约跳")
    public  PlainText  yuetiao;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/main_content']/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view4;


    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.zkj.guimi:id/fd_viewpager']"})
    @Description(description="")
    public  View  viewPager5;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/fdcb_img_desc']"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/fdcb_tv_desc']"})
    @Description(description="you are a bad boy, i hate you, i will call 110 if you follow me. go away")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/ldcv_row_1_tv']"})
    @Description(description="  免费3次")
    public  PlainText  price;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/ldcv_row_3_layout']/android.view.View[1]"})
    @Description(description="")
    public  View  view7;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/ldcv_row_3_tv']"})
    @Description(description="  等级随机  ")
    public  PlainText  levlePick;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/ldcv_row_3_layout']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView8;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/ldcv_row_2_left_tv']"})
    @Description(description="额外打赏")
    public  View  reward;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/ldcv_row_2_right_tv']"})
    @Description(description="捎话")
    public  PlainText  takeMessage;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/ldcv_row_2_right_msg_tv']"})
    @Description(description="捎话")
    public  PlainText  msg;

    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.zkj.guimi:id/fd_viewpager']/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view9;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/fdcb_tv_didi']"})
    @Description(description="")
    public  View  di;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[2]"})
    @Description(description="")
    public  View  view11;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_0']/android.view.View[1]"})
    @Description(description="")
    public  View  view12;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_0']"})
    @Description(description="")
    public  View  imageView13;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_0']"})
    @Description(description="搭讪")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_1']/android.view.View[1]"})
    @Description(description="")
    public  View  view14;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_1']"})
    @Description(description="")
    public  View  imageView15;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_1']"})
    @Description(description="发现")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_3']/android.view.View[1]"})
    @Description(description="")
    public  View  view16;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_3']"})
    @Description(description="")
    public  View  imageView17;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_2']/android.view.View[1]"})
    @Description(description="")
    public  View  view18;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_2']"})
    @Description(description="")
    public  View  imageView19;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_2']"})
    @Description(description="消息")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_4']/android.view.View[1]"})
    @Description(description="")
    public  View  view20;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_4']"})
    @Description(description="")
    public  View  imageView21;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_4']"})
    @Description(description="我")
    public  PlainText  textView14;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="")
    public  PlainText  dialog_ok;

    @Xpath(xpath={"com.zkj.guimi:id/dc_dialog_txt_content']"})
    @Description(description="")
    public  View  dialog_txt_content;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btnSubmit']"})
    @Description(description="")
    public  View  reward_ok;


    public DidiPageBean(AppiumDriver aDriver){super(aDriver);}

}