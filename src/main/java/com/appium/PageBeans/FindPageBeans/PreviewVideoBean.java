package com.appium.PageBeans.FindPageBeans;
import com.lazy.annotations.Description;
import com.lazy.annotations.Xpath;
import com.lazy.bean.BaseBean;
import com.lazy.controls.PlainText;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class PreviewVideoBean extends BaseBean {


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.view.View[1]"})
    @Description(description="")
    public View view1;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/action_bar_overlay_layout']"})
    @Description(description="")
    public  View  view2;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/action_bar']"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="视频预览")
    public PlainText title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="视频")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="确定")
    public  PlainText  sure;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/CoverView']"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.FrameLayout[@resource-id='com.zkj.guimi:id/VideoView']/android.view.View[1]"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avp_play_btn']"})
    @Description(description="")
    public  View  play;

    public PreviewVideoBean(AppiumDriver aDriver){super(aDriver);}

}