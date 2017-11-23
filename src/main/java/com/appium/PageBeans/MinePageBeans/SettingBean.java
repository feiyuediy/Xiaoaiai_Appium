package com.appium.PageBeans.MinePageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class SettingBean extends BaseBean{


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
    @Description(description="设置")
    public  PlainText  textView1;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.ScrollView"})
    @Description(description="")
    public  View  scrollView5;


    @Xpath(xpath={"//android.widget.TextView[@text='隐私']"})
    @Description(description="隐私")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.TextView[@text='潜水']"})
    @Description(description="潜水")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.TextView[@text='开启后不显示设备，不会出现在“达人”列表']"})
    @Description(description="开启后不显示设备，不会出现在“达人”列表")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/acs_tv_disturb']"})
    @Description(description="")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.TextView[@text='隐身访问']"})
    @Description(description="隐身访问")
    public  PlainText  textView71;


    @Xpath(xpath={"//android.widget.TextView[@text='开启后不会出现在他人的访客记录中']"})
    @Description(description="开启后不会出现在他人的访客记录中")
    public  PlainText  textView81;


    @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/tb_tracebility']"})
    @Description(description="")
    public  View  toggleButton7;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[2]"})
    @Description(description="")
    public  View  view8;


    @Xpath(xpath={"//android.widget.TextView[@text='消息通知']"})
    @Description(description="消息通知")
    public  PlainText  textView91;


    @Xpath(xpath={"//android.widget.TextView[@text='接收新消息通知']"})
    @Description(description="接收新消息通知")
    public  PlainText  textView101;


    @Xpath(xpath={"//android.widget.TextView[@text='关闭此选项将不再接收聊天消息推送']"})
    @Description(description="关闭此选项将不再接收聊天消息推送")
    public  PlainText  textView111;


    @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/tb_notify']"})
    @Description(description="")
    public  View  toggleButton9;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[3]"})
    @Description(description="")
    public  View  view10;


    @Xpath(xpath={"//android.widget.TextView[@text='声音']"})
    @Description(description="声音")
    public  PlainText  textView121;


    @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/tb_sound']"})
    @Description(description="")
    public  View  toggleButton11;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/sound_container']/android.view.View[1]"})
    @Description(description="")
    public  View  view121;


    @Xpath(xpath={"//android.widget.TextView[@text='震动']"})
    @Description(description="震动")
    public  PlainText  textView131;


    @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/tb_vibrate']"})
    @Description(description="")
    public  View  toggleButton13;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/vibrate_container']/android.view.View[1]"})
    @Description(description="")
    public  View  view14;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.TextView[3]"})
    @Description(description="通话开关")
    public  PlainText  textView141;


    @Xpath(xpath={"//android.widget.TextView[@text='视频通话']"})
    @Description(description="视频通话")
    public  PlainText  textView151;


    @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/tb_video_call_notify']"})
    @Description(description="")
    public  View  toggleButton15;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/video_container']/android.view.View[1]"})
    @Description(description="")
    public  View  view16;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="通话开关")
    public  PlainText  textView16;


    @Xpath(xpath={"//android.widget.TextView[@text='关闭语音通话之后，将不再接受语音通话邀请']"})
    @Description(description="关闭语音通话之后，将不再接受语音通话邀请")
    public  PlainText  textView17;


    @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/tb_voice_call_notify']"})
    @Description(description="")
    public  View  toggleButton17;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[4]"})
    @Description(description="")
    public  View  view181;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[5]"})
    @Description(description="")
    public  View  view19;


    @Xpath(xpath={"//android.widget.TextView[@text='聊天背景']"})
    @Description(description="聊天背景")
    public  PlainText  textView18;

    @Xpath(xpath={"//android.widget.TextView[@text='设置聊天背景']"})
    @Description(description="设置聊天背景")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/bg_setting']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[3]"})
    @Description(description="")
    public  View  view12;


    @Xpath(xpath={"//android.widget.TextView[@text='清除缓存']"})
    @Description(description="清除缓存")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[4]"})
    @Description(description="")
    public  View  view13;


    @Xpath(xpath={"//android.widget.TextView[@text='清除语音、图片所占用的储存空间']"})
    @Description(description="清除语音、图片所占用的储存空间")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/clear']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[5]"})
    @Description(description="")
    public  View  view15;


    @Xpath(xpath={"//android.widget.TextView[@text='清空所有聊天记录的缓存数据']"})
    @Description(description="清空所有聊天记录的缓存数据")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/clear_chat_record']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView16;


    @Xpath(xpath={"//android.widget.TextView[@text='账号与安全']"})
    @Description(description="账号与安全")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.TextView[@text='修改密码']"})
    @Description(description="修改密码")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/acs_layout_change_password']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView17;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/acs_layout_safety']/android.view.View[1]"})
    @Description(description="")
    public  View  view18;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/acs_tv_bind_phone']"})
    @Description(description="手机号更新")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/acs_tv_phone_number']"})
    @Description(description="已绑定 186****0321")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/acs_layout_bind_phone']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView19;


    @Xpath(xpath={"//android.widget.TextView[@text='退出登录']"})
    @Description(description="退出登录")
    public  PlainText  quit;



    public SettingBean(AppiumDriver aDriver){super(aDriver);}

}