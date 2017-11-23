package com.appium.PageBeans.MinePageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class AccountInfoBean extends BaseBean{


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
    @Description(description="12345654441")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  goBack;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="编辑")
    public  PlainText  Edit;


    @Xpath(xpath={"//android.widget.ScrollView[@resource-id='com.zkj.guimi:id/au_scrollview']"})
    @Description(description="")
    public  View  scrollView5;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/au_vp_photo_above']"})
    @Description(description="")
    public  View  view6;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/au_img_vip']"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/au_img_header']"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_name']"})
    @Description(description="12345654441")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_sex']"})
    @Description(description="sex")
    public  PlainText  sex;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_age']"})
    @Description(description="18")
    public  PlainText  age;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_constellation']"})
    @Description(description="巨蟹座")
    public  PlainText  star;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/level']"})
    @Description(description="2")
    public  PlainText  level;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/au_img_device_state']"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_charm_value']"})
    @Description(description="21656")
    public  PlainText  charm;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_wealth_value']"})
    @Description(description="22356")
    public  PlainText  wealth;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/au_v_line']"})
    @Description(description="")
    public  View  view10;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/iuh_tv_visitor']"})
    @Description(description="24")
    public  PlainText  visitorNum;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/iuh_tv_new_visitor']"})
    @Description(description="+24")
    public  PlainText  addVisitor;


    @Xpath(xpath={"//android.widget.TextView[@text='全部访客']"})
    @Description(description="全部访客")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_operate_host']/android.view.View[1]"})
    @Description(description="")
    public  View  view11;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/iuh_tv_favourite']"})
    @Description(description="9")
    public  PlainText  fanNum;


    @Xpath(xpath={"//android.widget.TextView[@text='粉丝']"})
    @Description(description="粉丝")
    public  PlainText  funText;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_operate_host']/android.view.View[2]"})
    @Description(description="")
    public  View  view12;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/iuh_tv_wealth']"})
    @Description(description="11470")
    public  PlainText  aiaibeanNum;


    @Xpath(xpath={"//android.widget.TextView[@text='爱爱豆']"})
    @Description(description="爱爱豆")
    public  PlainText aiai ;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/iuh_layout_wealth']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView13;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.View[2]"})
    @Description(description="")
    public  View  view14;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[3]"})
    @Description(description="")
    public  View  view15;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_feeds_num']"})
    @Description(description="11")
    public  PlainText  feedNum;


    @Xpath(xpath={"//android.widget.TextView[@text='个人动态']"})
    @Description(description="个人动态")
    public  PlainText  textView19;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_1']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView16;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_1']/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view17;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_1']/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_2']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView19;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_2']/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view20;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_3']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView21;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_3']/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view22;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_3']/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView23;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_4']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView24;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_4']/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view25;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_4']/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView26;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/au_layout_news_more_above4']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView27;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[4]"})
    @Description(description="")
    public  View  view28;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/au_vp_photo']"})
    @Description(description="")
    public  View  view29;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/au_vp_photo']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView30;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ipwi_img_indicator1']"})
    @Description(description="")
    public  View  imageView31;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ipwi_img_indicator2']"})
    @Description(description="")
    public  View  imageView32;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/au_img_signature_voice']"})
    @Description(description="")
    public  View  imageView33;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/au_tv_signature_time']"})
    @Description(description="5")
    public  PlainText  textView20;




    public AccountInfoBean(AppiumDriver aDriver){super(aDriver);}

}