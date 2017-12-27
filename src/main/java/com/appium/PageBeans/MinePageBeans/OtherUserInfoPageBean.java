package com.appium.PageBeans.MinePageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class OtherUserInfoPageBean extends BaseBean{


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
    @Description(description="0009")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.ScrollView[@resource-id='com.zkj.guimi:id/au_scrollview']"})
    @Description(description="")
    public  View  scrollView5;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/au_vp_photo_above']"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/au_img_header']"})
    @Description(description="")
    public  View  img_header;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_name']"})
    @Description(description="0009")
    public  PlainText  name;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_sex']"})
    @Description(description="女")
    public  PlainText  sex;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_age']"})
    @Description(description="18")
    public  PlainText  age;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_constellation']"})
    @Description(description="处女座")
    public  PlainText  constellation;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/level']"})
    @Description(description="2")
    public  PlainText  level;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/au_img_device_state']"})
    @Description(description="")
    public  View  device_state;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_charm_value']"})
    @Description(description="8091")
    public  PlainText  charm_value;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_wealth_value']"})
    @Description(description="5470")
    public  PlainText  wealth_value;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/au_v_line']"})
    @Description(description="")
    public  View  view9;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/iuo_img_favourite']"})
    @Description(description="")
    public  View  img_favourite;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/iuo_tv_favourite']"})
    @Description(description="22")
    public  PlainText  favourite;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_operate_guest']/android.view.View[1]"})
    @Description(description="")
    public  View  view11;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/iuo_img_black']"})
    @Description(description="")
    public  View  imageView12;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/iuo_tv_black']"})
    @Description(description="拉黑/举报")
    public  PlainText  iuo_tv_black;


    @Xpath(xpath={"//android.widget.ScrollView[@resource-id='com.zkj.guimi:id/au_scrollview']/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[2]"})
    @Description(description="")
    public  View  view13;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[3]"})
    @Description(description="")
    public  View  view14;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_no_feeds']"})
    @Description(description="专注自嗨30年，TA还没有发布过个人动态！")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_chat']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView15;


    @Xpath(xpath={"//android.widget.TextView[@text='聊天']"})
    @Description(description="聊天")
    public  PlainText  chat_button;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_chat_or_play']/android.view.View[1]"})
    @Description(description="")
    public  View  view16;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_invite_voice_call']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView17;

    @Xpath(xpath={"//android.widget.TextView[@text='视频']"})
    @Description(description="视频")
    public  PlainText  video_button;

    @Xpath(xpath={"    //android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_invite_voice_call']/android.widget.LinearLayout[1]\n"})
    @Description(description="视频空间")
    public  PlainText  video_button_frame;

    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_chat_or_play']/android.view.View[2]"})
    @Description(description="")
    public  View  view18;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_play_together']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView19;


    @Xpath(xpath={"//android.widget.TextView[@text='约跳']"})
    @Description(description="约跳")
    public  PlainText  yuetiao_button;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/au_vp_photo']"})
    @Description(description="")
    public  View  view20;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/au_vp_photo']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView21;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ipwi_img_indicator1']"})
    @Description(description="")
    public  View  imageView22;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ipwi_img_indicator2']"})
    @Description(description="")
    public  View  imageView23;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ipwi_img_indicator3']"})
    @Description(description="")
    public  View  imageView24;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dialog_btn_ok']"})
    @Description(description="")
    public  View  dialog_btn_ok;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="")
    public  View  dc_dialog_btn_ok;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dbp_tv_ban_person']"})
    @Description(description="")
    public  View  ban_person;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dg_btn_confirm']"})
    @Description(description="关注的时候的弹窗中的我知道了")
    public  View  dg_btn_confirm;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/groupItemTitle' and @text='视频通话']"})
    @Description(description="视频通话")
    public  View  videoCall;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/groupItemTitle' and @text='语音通话']"})
    @Description(description="语音通话")
    public  View  voiceCall;

    public OtherUserInfoPageBean(AppiumDriver aDriver){super(aDriver);}

}