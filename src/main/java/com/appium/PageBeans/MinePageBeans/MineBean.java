package com.appium.PageBeans.MinePageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class MineBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.ScrollView"})
    @Description(description="")
    public  View  scrollView2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="我")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/fs_img_vip']"})
    @Description(description="")
    public  View  imageView3;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/au_setting_img_header']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/fs_txt_aaName']"})
    @Description(description="12345654441")
    public  PlainText  nickName;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/fs_txt_aaNum']"})
    @Description(description="爱爱号: 8022010")
    public  PlainText  aiaiNum;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/level']"})
    @Description(description="2")
    public  PlainText  level;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_info']/android.widget.LinearLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView5;


    @Xpath(xpath={"//android.widget.ScrollView/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.ScrollView/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"})
    @Description(description="")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_recharge_center']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.TextView[@text='充值中心']"})
    @Description(description="充值中心")
    public  PlainText  rechargeCenter;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_recharge_center']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_recharge_center']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view8;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_vip']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.widget.TextView[@text='会员中心']"})
    @Description(description="会员中心")
    public  PlainText  vipCeanter;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_vip']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_vip']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view11;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_growth']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView12;


    @Xpath(xpath={"//android.widget.TextView[@text='成长中心']"})
    @Description(description="成长中心")
    public  PlainText  growupCenter;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_growth']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView13;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.TextView[3]"})
    @Description(description="")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_mall']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.TextView[@text='游戏大厅']"})
    @Description(description="游戏大厅")
    public  PlainText  gameCenter;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_mall']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView15;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_mall']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view16;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_wish']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView17;


    @Xpath(xpath={"//android.widget.TextView[@text='许愿商城']"})
    @Description(description="许愿夺宝")
    public  PlainText  wishCenter;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_wish']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_wish']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view19;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.TextView[4]"})
    @Description(description="")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_common']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView20;


    @Xpath(xpath={"//android.widget.TextView[@text='设置']"})
    @Description(description="设置")
    public  PlainText  Setting;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_common']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView21;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_common']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view22;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_help']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView23;


    @Xpath(xpath={"//android.widget.TextView[@text='帮助']"})
    @Description(description="帮助")
    public  PlainText  help;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_help']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView24;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_help']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view25;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_feedback']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView26;


    @Xpath(xpath={"//android.widget.TextView[@text='反馈']"})
    @Description(description="反馈")
    public  PlainText  feedback;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_feedback']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView27;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_feedback']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view28;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_share']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView29;


    @Xpath(xpath={"//android.widget.TextView[@text='分享']"})
    @Description(description="分享")
    public  PlainText  share;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_share']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView30;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fs_view_share']/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view31;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_0']/android.view.View[1]"})
    @Description(description="")
    public  View  view32;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_0']"})
    @Description(description="")
    public  View  imageView33;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_0']"})
    @Description(description="搭讪")
    public  PlainText  textView18;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_1']/android.view.View[1]"})
    @Description(description="")
    public  View  view34;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_1']"})
    @Description(description="")
    public  View  imageView35;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_1']"})
    @Description(description="发现")
    public  PlainText  textView19;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_2']/android.view.View[1]"})
    @Description(description="")
    public  View  view36;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_2']"})
    @Description(description="")
    public  View  imageView37;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_2']"})
    @Description(description="消息")
    public  PlainText  textView20;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_3']/android.view.View[1]"})
    @Description(description="")
    public  View  view38;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_3']"})
    @Description(description="")
    public  View  imageView39;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_3']"})
    @Description(description="约跳")
    public  PlainText  textView21;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_4']/android.view.View[1]"})
    @Description(description="")
    public  View  view40;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_4']"})
    @Description(description="")
    public  View  imageView41;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_4']"})
    @Description(description="我")
    public  PlainText  textView22;

    @Xpath(xpath={"//android.widget.TextView[@text='我的玩具']"})
    @Description(description="我的玩具")
    public  PlainText  mytool;


    @Xpath(xpath={"//android.widget.TextView[@text='关于']"})
    @Description(description="关于")
    public  PlainText  about;


    public MineBean(AppiumDriver aDriver){super(aDriver);}

}