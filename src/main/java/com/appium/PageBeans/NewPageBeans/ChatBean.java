package com.appium.PageBeans.NewPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class ChatBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="武神")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  icon_left;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="资料")
    public  PlainText  data;


    @Xpath(xpath={"//android.widget.ScrollView"})
    @Description(description="")
    public  View  scrollView3;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']"})
    @Description(description="")
    public  View  listView4;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_chatcontent']"})
    @Description(description="[):]")
    public  PlainText  tv_chatcontent;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/layout_msg']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/layout_msg']/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/layout_flexible_bless_tv']"})
    @Description(description="1")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/layout_flexible_tip']"})
    @Description(description="查看红包")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/backgound']"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/bar_bottom']/android.view.View[1]"})
    @Description(description="")
    public  View  view11;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_mode_voice']"})
    @Description(description="")
    public  Click  btn_mode_voice;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/input_container']"})
    @Description(description="")
    public  Text  input_container;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/fc_shortcut_fun_view']/android.widget.RelativeLayout[6]/android.widget.ImageView[1]"})
    @Description(description="")
    public  Click  btn_emoticons;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_add']"})
    @Description(description="")
    public  Click  btn_add;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/bar_bottom']/android.view.View[2]"})
    @Description(description="")
    public  View  view12;

    @Xpath(xpath = {"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_send']"})
    @Description(description = "")
    public Click send;


    @Xpath(xpath = {"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_press_to_speak']"})
    @Description(description = "")
    public Click btn_press_to_speak;

    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/other_container']"})
    @Description(description="")
    public  View  gridView13;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/fc_shortcut_fun_view']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  add_pic;


    @Xpath(xpath={"//android.widget.TextView[@text='图片']"})
    @Description(description="图片")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/other_container']/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  add_camra;


    @Xpath(xpath={"//android.widget.TextView[@text='拍照']"})
    @Description(description="拍照")
    public  PlainText  textView8;

    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_mode_text']"})
    @Description(description="")
    public  View  btn_mode_text;

    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/other_container']/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView16;

    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/fc_shortcut_fun_view']/android.widget.RelativeLayout[6]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  send_emoj;

    @Xpath(xpath={"    //android.widget.GridView[@resource-id='com.zkj.guimi:id/gridview']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]\n"})
    @Description(description="")
    public  View  emoj;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_camera']"})
    @Description(description="拍照")
    public  PlainText  dchi_tv_camera;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_select_from_phone']"})
    @Description(description="从手机相册选择")
    public  PlainText  dchi_tv_select_from_phone;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_cancel']"})
    @Description(description="取消")
    public  PlainText  dchi_tv_cancel;

    @Xpath(xpath={"//android.widget.TextView[@text='小视频']"})
    @Description(description="小视频")
    public  PlainText  add_video;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/other_container']/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView17;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/fc_shortcut_fun_view']/android.widget.RelativeLayout[4]/android.widget.ImageView[1]"})
    @Description(description="阅后即焚")
    public  PlainText  add_BurnAfterReading;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/fc_shortcut_fun_view']/android.widget.RelativeLayout[5]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  add_gift;


    @Xpath(xpath={"//android.widget.TextView[@text='礼包']"})
    @Description(description="礼包")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/other_container']/android.widget.LinearLayout[6]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  add_redPack;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/oci_flexible_scheme_num']"})
    @Description(description="3")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.TextView[@text='红包']"})
    @Description(description="红包")
    public  PlainText  textView13;

    @Xpath(xpath = {""})
    @Description(description = "")
    public View msg_status;

    @Xpath(xpath = {""})
    @Description(description = "")
    public View chatcontent;

    @Xpath(xpath = {""})
    @Description(description = "")
    public View userhead;


    @Xpath(xpath = {" //android.widget.ListView[@resource-id='com.zkj.guimi:id/list']"})
    @Description(description = "")
    public View chatList;

    @Xpath(xpath = {"//android.widget.TextView[@resource-id='com.zkj.guimi:id/timestamp']"})
    @Description(description = "")
    public View timestamp;

    public ChatBean(AppiumDriver aDriver){super(aDriver);}

}