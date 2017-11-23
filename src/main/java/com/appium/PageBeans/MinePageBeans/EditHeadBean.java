package com.appium.PageBeans.MinePageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class EditHeadBean extends BaseBean{


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
    @Description(description="头像")
    public  PlainText  textView1;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="保存")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/ah_gridview']"})
    @Description(description="")
    public  View  gridView5;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/ah_gridview']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/ah_gridview']/android.widget.LinearLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView7;




    public EditHeadBean(AppiumDriver aDriver){super(aDriver);}

}