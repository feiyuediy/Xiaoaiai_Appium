package com.appium.PageBeans.DidiPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;
import com.lazy.controls.Click;
import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class FollowFramPageBean extends BaseBean{


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/dd_lottie_bowen']"})
    @Description(description="")
    public  View  imageView1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dd_tv_nickname']"})
    @Description(description="0001")
    public  PlainText  nickName;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/dd_img_type']"})
    @Description(description="")
    public  View  imageView2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dd_tv_didi_follow_success']"})
    @Description(description="互粉成功！")
    public  PlainText  follow_success;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_cancel']"})
    @Description(description="cancel")
    public Click button1;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/dc_dialog_view_line_v']"})
    @Description(description="")
    public  View  view4;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="查看资料")
    public  Click  ViewData;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/laag_header']"})
    @Description(description="")
    public  View  laag_header;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/laag_gender']"})
    @Description(description="")
    public  View  imageView6;




    public FollowFramPageBean(AppiumDriver aDriver){super(aDriver);}

}