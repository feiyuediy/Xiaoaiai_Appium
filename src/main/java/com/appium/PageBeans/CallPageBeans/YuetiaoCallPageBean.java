package com.appium.PageBeans.CallPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;
import com.lazy.controls.Click;
import com.lazy.controls.PlainText;
import com.lazy.controls.Text;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class YuetiaoCallPageBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/dialog_icon']"})
    @Description(description="")
    public  View  imageView2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dialog_txt_title']"})
    @Description(description="设备未连接")
    public  PlainText  dialog_txt_title;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dialog_txt_content']"})
    @Description(description="您的设备未连接，是否连接设备？")
    public  PlainText  dialog_txt_content;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/dialog_action_alert']/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dialog_btn_cancel']"})
    @Description(description="取消")
    public  Click  dialog_btn_cancel;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/dialog_view_line_v']"})
    @Description(description="")
    public  View  view4;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dialog_btn_ok']"})
    @Description(description="连接")
    public  Click  dialog_btn_ok;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="断开")
    public  PlainText  close;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left_user']"})
    @Description(description="23424234")
    public  PlainText  txt_left_user;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/title_view']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right_user']"})
    @Description(description="0001")
    public  PlainText  txt_right_user;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right']"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right_3']"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/ac_interaction_music']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/ac_interaction_standrad']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.widget.ScrollView"})
    @Description(description="")
    public  View  scrollView10;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']"})
    @Description(description="")
    public  View  listView11;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/timestamp' and @text='上午 09:59']"})
    @Description(description="上午 09:59")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.TextView[@text='23424234给0001赠送了 粥×20']"})
    @Description(description="23424234给0001赠送了 粥×20")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView12;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView13;


    @Xpath(xpath={"//android.widget.TextView[@text='通话时长  00:07']"})
    @Description(description="通话时长  00:07")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView15;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView16;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/timestamp' and @text='上午 10:00']"})
    @Description(description="上午 10:00")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.TextView[@text='23424234给0001赠送了 粥×10']"})
    @Description(description="23424234给0001赠送了 粥×10")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView17;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.TextView[@text='通话时长  00:10']"})
    @Description(description="通话时长  00:10")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView19;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView20;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView21;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/backgound']"})
    @Description(description="")
    public  View  imageView22;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/bar_bottom']/android.view.View[1]"})
    @Description(description="")
    public  View  view23;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_mode_voice']"})
    @Description(description="")
    public  Click  button3;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/input_container']"})
    @Description(description="")
    public Text editText1;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_gift']"})
    @Description(description="")
    public  Click  button4;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_emoticons']"})
    @Description(description="")
    public  Click  button5;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_add']"})
    @Description(description="")
    public Click button6;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/bar_bottom']/android.view.View[2]"})
    @Description(description="")
    public  View  view24;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dc_dialog_txt_title']"})
    @Description(description="")
    public  View  dc_dialog_txt_title;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_cancel']"})
    @Description(description="")
    public  View  dc_dialog_btn_cancel;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="")
    public  View  dc_dialog_btn_ok;


    public YuetiaoCallPageBean(AppiumDriver aDriver){super(aDriver);}

}