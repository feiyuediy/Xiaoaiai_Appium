package com.appium.PageBeans.NewPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class GroupBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="消息")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  icon_left;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/blank']"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']"})
    @Description(description="")
    public  View  listView4;


    @Xpath(xpath={"//android.widget.ProgressBar[@resource-id='com.zkj.guimi:id/dh_circle_bar']"})
    @Description(description="")
    public  View  progressBar5;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/dh_animation_img']"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.zkj.guimi:id/adv_viewpager']"})
    @Description(description="")
    public  View  viewPager7;


    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.zkj.guimi:id/adv_viewpager']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  banner;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/adv_indicator']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/adv_indicator']/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/groups_category_title']"})
    @Description(description="我的群组")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[3]/android.view.View[1]"})
    @Description(description="")
    public  View  view11;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  fristMyGroupHead;


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="武神")
    public  PlainText  fristMyGroupName;


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"})
    @Description(description="德玛西亚之力")
    public  PlainText  fristMyGroupDesc;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view13;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  secMyGroupHead;


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="ig")
    public  PlainText  secMyGroupName;


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"})
    @Description(description="lol")
    public  PlainText  secMyGroupDesc;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.LinearLayout[2]/android.view.View[1]"})
    @Description(description="")
    public  View  view15;


    @Xpath(xpath={"//android.widget.TextView[@text='推荐群组']"})
    @Description(description="推荐群组")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/ligr_layout']/android.view.View[1]"})
    @Description(description="")
    public  View  view16;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/ligr_all_category']"})
    @Description(description="全部群组")
    public  PlainText  allGroup;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/vii_img_arrow']"})
    @Description(description="")
    public  View  imageView17;



    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="测试群组1")
    public  PlainText  fristRecommendGroupHead;


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="测试群组1测试群组1ghhhhhh")
    public  PlainText  fristRecommendGroupName;


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"})
    @Description(description="聊天消息")
    public  PlainText  fristRecommendGroupDesc;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/fm_tv_connect_msg']"})
    @Description(description="群组")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/fm_tv_contacts_list']"})
    @Description(description="联系人")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/fm_layout_msg_table_parent']/android.view.View[1]"})
    @Description(description="")
    public  View  view19;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_0']/android.view.View[1]"})
    @Description(description="")
    public  View  view20;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_0']"})
    @Description(description="")
    public  View  imageView21;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_0']"})
    @Description(description="搭讪")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_1']/android.view.View[1]"})
    @Description(description="")
    public  View  view22;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_1']"})
    @Description(description="")
    public  View  imageView23;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_1']"})
    @Description(description="发现")
    public  PlainText  textView15;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_2']/android.view.View[1]"})
    @Description(description="")
    public  View  view24;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_2']"})
    @Description(description="")
    public  View  imageView25;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_2']"})
    @Description(description="消息")
    public  PlainText  textView16;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_3']/android.view.View[1]"})
    @Description(description="")
    public  View  view26;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_3']"})
    @Description(description="")
    public  View  imageView27;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_3']"})
    @Description(description="约跳")
    public  PlainText  textView17;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_4']/android.view.View[1]"})
    @Description(description="")
    public  View  view28;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_4']"})
    @Description(description="")
    public  View  imageView29;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_4']"})
    @Description(description="我")
    public  PlainText  textView18;




    public GroupBean(AppiumDriver aDriver){super(aDriver);}

}