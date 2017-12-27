package com.appium.PageBeans.CallPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class ComingCallBean extends BaseBean{


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/swing_card']"})
    @Description(description="")
    public  View  imageView1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_nick']"})
    @Description(description="0090")
    public  PlainText  tv_nick;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_call_state']"})
    @Description(description="邀请你语音电话")
    public  PlainText  call_state;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/btn_refuse_call']"})
    @Description(description="")
    public  View  refuse_call;


    @Xpath(xpath={"//android.widget.TextView[@text='拒绝']"})
    @Description(description="拒绝")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/btn_answer_call']"})
    @Description(description="")
    public  View  answer_call;


    @Xpath(xpath={"//android.widget.TextView[@text='接听']"})
    @Description(description="接听")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avc_header_bg_image']"})
    @Description(description="")
    public  View  imageView4;




    public ComingCallBean(AppiumDriver aDriver){super(aDriver);}

}