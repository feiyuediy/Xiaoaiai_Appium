package com.appium.PageBeans.MinePageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class EditCityBean extends BaseBean{


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
    @Description(description="修改地区")
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


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/filter_edit']"})
    @Description(description="输入城市名或首字母查询")
    public  Text  editText1;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']"})
    @Description(description="")
    public  View  listView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/catalog']"})
    @Description(description="热门")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.TextView[@text='北京']"})
    @Description(description="北京")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.TextView[3]"})
    @Description(description="")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.TextView[@text='上海虹桥']"})
    @Description(description="上海虹桥")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']/android.widget.LinearLayout[2]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.TextView[@text='上海浦东']"})
    @Description(description="上海浦东")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']/android.widget.LinearLayout[3]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.TextView[@text='广州']"})
    @Description(description="广州")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']/android.widget.LinearLayout[4]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.TextView[@text='深圳']"})
    @Description(description="深圳")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']/android.widget.LinearLayout[5]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.widget.TextView[@text='香港']"})
    @Description(description="香港")
    public  PlainText  textView15;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']/android.widget.LinearLayout[6]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView16;


    @Xpath(xpath={"//android.widget.TextView[@text='澳门']"})
    @Description(description="澳门")
    public  PlainText  textView17;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']/android.widget.LinearLayout[7]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView18;


    @Xpath(xpath={"//android.widget.TextView[@text='天津']"})
    @Description(description="天津")
    public  PlainText  textView19;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']/android.widget.LinearLayout[8]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView20;


    @Xpath(xpath={"//android.widget.TextView[@text='成都']"})
    @Description(description="成都")
    public  PlainText  textView21;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']/android.widget.LinearLayout[9]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView22;


    @Xpath(xpath={"//android.widget.TextView[@text='重庆']"})
    @Description(description="重庆")
    public  PlainText  textView23;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/country_lvcountry']/android.widget.LinearLayout[10]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView24;


    @Xpath(xpath={"//android.widget.TextView[@text='南京']"})
    @Description(description="南京")
    public  PlainText  textView25;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/sidrbar']"})
    @Description(description="")
    public  View  view6;




    public EditCityBean(AppiumDriver aDriver){super(aDriver);}

}