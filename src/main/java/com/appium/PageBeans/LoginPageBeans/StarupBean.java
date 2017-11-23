package com.appium.PageBeans.LoginPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class StarupBean extends BaseBean{


    @Xpath(xpath={"//android.view.View"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.zkj.guimi:id/viewpager']"})
    @Description(description="")
    public  View  viewPager2;


    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.zkj.guimi:id/viewpager']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView3;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/indicator']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/indicator']/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/indicator']/android.widget.ImageView[3]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_register']"})
    @Description(description="注册")
    public  Click  regist;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_login']"})
    @Description(description="登录")
    public  Click  login;

    public StarupBean(AppiumDriver aDriver){super(aDriver);}

}