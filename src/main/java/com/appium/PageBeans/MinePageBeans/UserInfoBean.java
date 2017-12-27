package com.appium.PageBeans.MinePageBeans;
import com.lazy.annotations.Description;
import com.lazy.annotations.FullIndexXpath;
import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class UserInfoBean extends BaseBean{


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
    @Description(description="个人资料")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.ScrollView"})
    @Description(description="")
    public  View  scrollView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/api_tv_header']"})
    @Description(description="头像")
    public  PlainText  headTable;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/api_img_header']"})
    @Description(description="")
    public  View  headImage;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/api_img_header_arrow']"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view8;


    @Xpath(xpath={"//android.widget.TextView[@text='ID照']"})
    @Description(description="ID照")
    public  PlainText  idPhoto;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/api_view_id_photo']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/api_id_photo_lien']"})
    @Description(description="")
    public  View  view10;


    @Xpath(xpath={"//android.widget.TextView[@text='用户昵称']"})
    @Description(description="用户昵称")
    public  PlainText  userNickTable;


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.view.View[2]/android.widget.FrameLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]"})
    @Description(description="12345654441")
    public  PlainText  userNick;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/api_view_nickname']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[3]"})
    @Description(description="")
    public  View  view12;


    @Xpath(xpath={"//android.widget.TextView[@text='爱爱号']"})
    @Description(description="爱爱号")
    public  PlainText  aiaiTable;


    @FullIndexXpath(fullIndexXpath="//android.widget.FrameLayout[1]/android.view.View[2]/android.widget.FrameLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    @Description(description="8022010")
    public  PlainText  aiaiNum;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[4]"})
    @Description(description="")
    public  View  view13;


    @Xpath(xpath={"//android.widget.TextView[@text='性别']"})
    @Description(description="性别")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.TextView[@text='女']"})
    @Description(description="女")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[5]"})
    @Description(description="")
    public  View  view14;


    @Xpath(xpath={"//android.widget.TextView[@text='地区']"})
    @Description(description="地区")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.TextView[@text='保密']"})
    @Description(description="保密")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/api_view_location']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView15;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[6]"})
    @Description(description="")
    public  View  view16;


    @Xpath(xpath={"//android.widget.TextView[@text='年龄']"})
    @Description(description="年龄")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.TextView[@text='18']"})
    @Description(description="18")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/api_view_age']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView17;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[7]"})
    @Description(description="")
    public  View  view18;


    @Xpath(xpath={"//android.widget.TextView[@text='星座']"})
    @Description(description="星座")
    public  PlainText  textView15;


    @Xpath(xpath={"//android.widget.TextView[@text='巨蟹座']"})
    @Description(description="巨蟹座")
    public  PlainText  textView16;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[8]"})
    @Description(description="")
    public  View  view19;


    @Xpath(xpath={"//android.widget.TextView[@text='个人签名']"})
    @Description(description="个人签名")
    public  PlainText  textView17;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/api_tv_signature']"})
    @Description(description="权")
    public  PlainText  textView18;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/api_img_signature_arrow']"})
    @Description(description="")
    public  View  imageView20;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[9]"})
    @Description(description="")
    public  View  view21;


    @Xpath(xpath={"//android.widget.TextView[@text='语音签名']"})
    @Description(description="语音签名")
    public  PlainText  textView19;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/api_img_audio_signature_arrow']"})
    @Description(description="")
    public  View  imageView22;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[10]"})
    @Description(description="")
    public  View  view23;


    @Xpath(xpath={"//android.widget.TextView[@text='个人标签']"})
    @Description(description="个人标签")
    public  PlainText  textView20;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/iul_tv_label3']"})
    @Description(description="待解救")
    public  PlainText  textView21;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/api_img_label_arrow']"})
    @Description(description="")
    public  View  imageView24;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/iuh_tv_wealth']"})
    @Description(description="")
    public  View  aiaidou;




    public UserInfoBean(AppiumDriver aDriver){super(aDriver);}

}