package com.appium.PageBeans.MinePageBeans;

import com.lazy.annotations.Description;
import com.lazy.annotations.Xpath;
import com.lazy.bean.BaseBean;
import com.lazy.controls.PlainText;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class PersonaFeed extends BaseBean {


    @Xpath(xpath={"//android.view.ViewGroup[@resource-id='android:id/decor_content_parent']"})
    @Description(description="")
    public View viewGroup1;


    @Xpath(xpath={"//android.view.ViewGroup[@resource-id='android:id/action_bar']"})
    @Description(description="")
    public  View  viewGroup2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="个人动态")
    public PlainText txt_title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView3;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right_3']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']"})
    @Description(description="")
    public  View  listView5;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.TextView[1]"})
    @Description(description="雅致的迪丽热巴")
    public  PlainText  textView3;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.TextView[2]"})
    @Description(description="置顶")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.TextView[3]"})
    @Description(description="3")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.ImageView[3]"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view9;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view10;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.TextView[4]"})
    @Description(description="#hdw#")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.ImageView[4]"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.TextView[5]"})
    @Description(description="01月02日 15:25")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.TextView[6]"})
    @Description(description="删除")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView12;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="0")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView13;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]"})
    @Description(description="0")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[1]/android.view.View[2]"})
    @Description(description="")
    public  View  view14;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_vip']"})
    @Description(description="")
    public  View  imageView15;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView16;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_name' and @text='23424234']"})
    @Description(description="23424234")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.widget.TextView[2]"})
    @Description(description="置顶")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.widget.TextView[3]"})
    @Description(description="3")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.widget.ImageView[3]"})
    @Description(description="")
    public  View  imageView17;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_device_state']"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_signature_audio']"})
    @Description(description="")
    public  View  imageView19;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_num_1']"})
    @Description(description="30229")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_num_2']"})
    @Description(description="57660")
    public  PlainText  textView15;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.ImageView[6]"})
    @Description(description="")
    public  View  imageView20;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.view.View[1]"})
    @Description(description="")
    public  View  view21;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_content']"})
    @Description(description="大傻逼，。*&……aaa47677")
    public  PlainText  textView16;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_label' and @text='#猜猜猜猜#']"})
    @Description(description="#猜猜猜猜#")
    public  PlainText  textView17;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.ImageView[7]"})
    @Description(description="")
    public  View  imageView22;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.TextView[8]"})
    @Description(description="01月02日 15:25")
    public  PlainText  textView18;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.TextView[9]"})
    @Description(description="删除")
    public  PlainText  textView19;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView23;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="0")
    public  PlainText  textView20;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView24;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]"})
    @Description(description="0")
    public  PlainText  textView21;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[2]/android.view.View[2]"})
    @Description(description="")
    public  View  view25;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView26;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.TextView[1]"})
    @Description(description="雅致的迪丽热巴")
    public  PlainText  textView22;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.TextView[2]"})
    @Description(description="置顶")
    public  PlainText  textView23;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.TextView[3]"})
    @Description(description="3")
    public  PlainText  textView24;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView27;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.ImageView[3]"})
    @Description(description="")
    public  View  imageView28;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.view.View[1]"})
    @Description(description="")
    public  View  view29;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view30;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.TextView[4]"})
    @Description(description="#hdw#")
    public  PlainText  textView25;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.ImageView[4]"})
    @Description(description="")
    public  View  imageView31;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_feeds_time' and @text='2017年12月29日']"})
    @Description(description="2017年12月29日")
    public  PlainText  textView26;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/abl_listview']/android.widget.RelativeLayout[3]/android.widget.TextView[6]"})
    @Description(description="删除")
    public  PlainText  textView27;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/statusBarBackground']"})
    @Description(description="")
    public  View  view32;




    public PersonaFeed(AppiumDriver aDriver){super(aDriver);}

}