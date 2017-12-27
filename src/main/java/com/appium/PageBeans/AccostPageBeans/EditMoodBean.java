package com.appium.PageBeans.AccostPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;
import com.lazy.controls.Text;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class EditMoodBean extends BaseBean{


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
    @Description(description="心情宣言")
    public  PlainText  textView1;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="保存")
    public  PlainText  save;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/mood']"})
    @Description(description="肥过快。家这")
    public Text editText1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_num']"})
    @Description(description="6/20字")
    public  PlainText  textView4;




    public EditMoodBean(AppiumDriver aDriver){super(aDriver);}

}