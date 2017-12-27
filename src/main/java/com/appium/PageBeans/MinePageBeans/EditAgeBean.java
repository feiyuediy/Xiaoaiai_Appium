package com.appium.PageBeans.MinePageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class EditAgeBean extends BaseBean{


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
    @Description(description="年龄和星座")
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


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/ape_layout_age']/android.view.View[1]"})
    @Description(description="")
    public  View  view5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/vii_tv_title' and @text='年龄']"})
    @Description(description="年龄")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/vii_tv_content' and @text='18']"})
    @Description(description="18")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/vii_img_arrow']"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/ape_layout_age']/android.view.View[2]"})
    @Description(description="")
    public  View  view7;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/vii_tv_title' and @text='星座']"})
    @Description(description="星座")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/vii_tv_content' and @text='巨蟹座']"})
    @Description(description="巨蟹座")
    public  PlainText  textView7;




    public EditAgeBean(AppiumDriver aDriver){super(aDriver);}

}