package com.appium.PageBeans.DidiPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;
import com.lazy.controls.Text;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class TakeMsgPageBean extends BaseBean{


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
    @Description(description="  捎话  ")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="确定")
    public  PlainText  sure;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right_3']"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/adem_edittext']"})
    @Description(description="输入你想说的话")
    public Text editText1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/adem_tv_words_limit']"})
    @Description(description="0/20字")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.TextView[@text='  快捷短语']"})
    @Description(description="  快捷短语")
    public  PlainText  Shortcut;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/adem_img_arrow']"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view7;




    public TakeMsgPageBean(AppiumDriver aDriver){super(aDriver);}

}