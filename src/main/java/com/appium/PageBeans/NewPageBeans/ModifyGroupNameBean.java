package com.appium.PageBeans.NewPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;
import com.lazy.controls.Text;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class ModifyGroupNameBean extends BaseBean{


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
    @Description(description="群名称")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="提交")
    public  PlainText  submit;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/aegn_et_name']"})
    @Description(description="武神")
    public Text et_name;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/aegn_img_clear']"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/aegn_tv_length']"})
    @Description(description="2/10")
    public  PlainText  tv_length;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.LinearLayout[1]"})
    @Description(description="")
    public  PlainText  dialog_title;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="")
    public  PlainText  dialog_btn_ok;

    public ModifyGroupNameBean(AppiumDriver aDriver){super(aDriver);}

}