package com.appium.PageBeans.NewPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class SearchPageBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/action_bar_overlay_layout']"})
    @Description(description="")
    public  View  view2;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/action_bar']"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lse_img']"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/lse_edit']"})
    @Description(description="搜索")
    public  Text  serchEdit;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/ab_layout_search']/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right_3']"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']"})
    @Description(description="")
    public  View  listView8;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/blank']"})
    @Description(description="")
    public  View  view9;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/img_search']"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/title']"})
    @Description(description="全网搜索")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.TextView[@text='通过全网搜索用户']"})
    @Description(description="通过全网搜索用户")
    public  PlainText  textView3;

    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/layout_user_has_find']"})
    @Description(description="通过全网搜索用户")
    public  PlainText  user_has_find;

    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/search_network']"})
    @Description(description="通过全网搜索用户")
    public  PlainText  search_network;


    public SearchPageBean(AppiumDriver aDriver){super(aDriver);}

}