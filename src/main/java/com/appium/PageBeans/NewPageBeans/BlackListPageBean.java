package com.appium.PageBeans.NewPageBeans;

import io.appium.java_client.AppiumDriver;
import lazy.android.annotations.Description;
import lazy.android.annotations.Xpath;
import lazy.android.bean.BaseBean;
import lazy.android.controls.PlainText;
import lazy.android.controls.View;


public class BlackListPageBean extends BaseBean{


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
    @Description(description="我的关注")
    public  PlainText  tilte;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right_3']"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']"})
    @Description(description="")
    public  View  listView6;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/lsu_search_layout']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.TextView[@text='输入用户昵称或爱爱号搜索']"})
    @Description(description="输入用户昵称或爱爱号搜索")
    public  PlainText  search;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avatar']"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/indicator']"})
    @Description(description="")
    public  View  view9;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/name']"})
    @Description(description="0001")
    public  PlainText  name;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/signature']"})
    @Description(description="你才是猴子派来的逗B吧……")
    public  PlainText  signature;




    public BlackListPageBean(AppiumDriver aDriver){super(aDriver);}

}