package com.appium.PageBeans.DidiPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class EvaluatePageBean extends BaseBean{


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/decor_content_parent']"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/action_bar']"})
    @Description(description="")
    public  View  view2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="??")
    public  PlainText  txt_title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  txt_left;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="??")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.ScrollView"})
    @Description(description="")
    public  View  scrollView4;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avatar']"})
    @Description(description="")
    public  View  head;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/name_tv']"})
    @Description(description="23424234")
    public  PlainText  name_tv;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tip_tv']"})
    @Description(description="????")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.view.View[2]"})
    @Description(description="")
    public  View  view7;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[1]"})
    @Description(description="")
    public  View  oneStar;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[2]"})
    @Description(description="")
    public  View  twoStar;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[3]"})
    @Description(description="")
    public  View  threeStar;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[4]"})
    @Description(description="")
    public  View  fourStar;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[5]"})
    @Description(description="")
    public  View  fiveStar;


    @Xpath(xpath={"//android.widget.ScrollView/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="????")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/labelView']"})
    @Description(description="")
    public  View  view13;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text' and @text='???(2)']"})
    @Description(description="???(2)")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/labelView']/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text' and @text='????(1)']"})
    @Description(description="????(1)")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/labelView']/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView15;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/expand_layout']/android.view.View[1]"})
    @Description(description="")
    public  View  view16;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/expand_button']"})
    @Description(description="????????")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/expand_layout']/android.view.View[2]"})
    @Description(description="")
    public  View  view17;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/submit_btn']"})
    @Description(description="??")
    public  PlainText  submit_btn;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/statusBarBackground']"})
    @Description(description="")
    public  View  view18;




    public EvaluatePageBean(AppiumDriver aDriver){super(aDriver);}

}