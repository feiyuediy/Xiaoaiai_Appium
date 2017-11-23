package com.appium.PageBeans.NewPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class ChatNewBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="消息")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  icon_left;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/blank']"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']"})
    @Description(description="")
    public  View  listView4;


    @Xpath(xpath={"//android.widget.ProgressBar[@resource-id='com.zkj.guimi:id/dh_circle_bar']"})
    @Description(description="")
    public  View  progressBar5;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/dh_animation_img']"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image']"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text']"})
    @Description(description="您还没有聊天记录")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/sub_text']"})
    @Description(description="到去寻找TA吧")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.TextView[1]']"})
    @Description(description="聊天消息")
    public  PlainText  chatmsg;


    @Xpath(xpath={"//android.widget.TextView[@text='群组']"})
    @Description(description="群组")
    public  PlainText  group;


    @Xpath(xpath={"//android.widget.TextView[@text='联系人']"})
    @Description(description="联系人")
    public  PlainText  contacts;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fm_layout_msg_table_parent']/android.view.View[1]"})
    @Description(description="")
    public  View  view8;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_0']/android.view.View[1]"})
    @Description(description="")
    public  View  view9;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_0']"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_0']"})
    @Description(description="搭讪")
    public  PlainText  accoston;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_1']/android.view.View[1]"})
    @Description(description="")
    public  View  view11;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_1']"})
    @Description(description="")
    public  View  imageView12;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_1']"})
    @Description(description="发现")
    public  PlainText  find;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_2']/android.view.View[1]"})
    @Description(description="")
    public  View  view13;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_2']"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_2']"})
    @Description(description="消息")
    public  PlainText  news;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_3']/android.view.View[1]"})
    @Description(description="")
    public  View  view15;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_3']"})
    @Description(description="")
    public  View  imageView16;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_3']"})
    @Description(description="约跳")
    public  PlainText  yuetiao;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_4']/android.view.View[1]"})
    @Description(description="")
    public  View  view17;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_4']"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_4']"})
    @Description(description="我")
    public  PlainText  mime;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/name']"})
    @Description(description="")
    public  PlainText  fristName;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/ok']"})
    @Description(description="")
    public  PlainText  delectChat;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/timestamp']"})
    @Description(description="")
    public  PlainText  timestamp;

    public ChatNewBean(AppiumDriver aDriver){super(aDriver);}

}