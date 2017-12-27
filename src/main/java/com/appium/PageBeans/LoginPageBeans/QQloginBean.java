package com.appium.PageBeans.LoginPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;
import com.lazy.controls.Click;
import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class QQloginBean extends BaseBean{


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.tencent.mobileqq:id/ivTitleBtnLeft']"})
    @Description(description="返回")
    public  PlainText  textView1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.tencent.mobileqq:id/ivTitleName']"})
    @Description(description="QQ登录")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.ScrollView"})
    @Description(description="")
    public  View  scrollView1;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView2;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.tencent.mobileqq:id/name']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView3;


    @Xpath(xpath={"//android.widget.TextView[@text='小爱爱']"})
    @Description(description="小爱爱")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@text='麦田']"})
    @Description(description="麦田")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.TextView[@text='（171769733）']"})
    @Description(description="（171769733）")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.TextView[@text='你已对该应用授权']"})
    @Description(description="你已对该应用授权")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.ScrollView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.tencent.mobileqq:id/name']"})
    @Description(description="登录")
    public Click qqLogin;


    @Xpath(xpath={"//android.widget.TextView[@text='切换帐号']"})
    @Description(description="切换帐号")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.view.View"})
    @Description(description="")
    public  View  view7;




    public QQloginBean(AppiumDriver aDriver){super(aDriver);}

}