package com.appium.PageBeans.LoginPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;

import io.appium.java_client.AppiumDriver;


public class LoginBean extends BaseBean{


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
    @Description(description="登录")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/input_username']"})
    @Description(description="4097146")
    public  Text  account;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view5;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/input_password']"})
    @Description(description="")
    public  Text  pwd;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_login']"})
    @Description(description="登录")
    public  Click  login;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/btn_register_now']"})
    @Description(description="立即注册！")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/btn_forget_pwd']"})
    @Description(description="忘记密码？")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.TextView[@text='使用第三方帐号一键登录']"})
    @Description(description="使用第三方帐号一键登录")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/btn_login_qq']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  QQlogin;


    @Xpath(xpath={"//android.widget.TextView[@text='QQ']"})
    @Description(description="QQ")
    public  PlainText  QQ;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/btn_login_weixin']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  weixinlogin;


    @Xpath(xpath={"//android.widget.TextView[@text='微信']"})
    @Description(description="微信")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/btn_login_sian_weibo']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  weiboLogin;


    @Xpath(xpath={"//android.widget.TextView[@text='新浪微博']"})
    @Description(description="新浪微博")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.TextView[@text='通过设置账号，即表示你接收小爱爱的']"})
    @Description(description="通过设置账号，即表示你接收小爱爱的")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_clause']"})
    @Description(description="服务条款")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.TextView[@text='和']"})
    @Description(description="和")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_policy']"})
    @Description(description="隐私政策")
    public  PlainText  textView12;

    public LoginBean(AppiumDriver aDriver){super(aDriver);}

}