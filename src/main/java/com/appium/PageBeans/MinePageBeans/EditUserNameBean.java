package com.appium.PageBeans.MinePageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;
import com.lazy.controls.Text;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class EditUserNameBean extends BaseBean{


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
    @Description(description="用户昵称")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="保存")
    public  PlainText  save;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_value1']"})
    @Description(description="用户昵称")
    public  PlainText  nickNameTable;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/input_value1']"})
    @Description(description="12345654441")
    public Text nickName;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/line1']"})
    @Description(description="")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/line2']"})
    @Description(description="")
    public  PlainText  textView6;

    public EditUserNameBean(AppiumDriver aDriver){super(aDriver);}

}