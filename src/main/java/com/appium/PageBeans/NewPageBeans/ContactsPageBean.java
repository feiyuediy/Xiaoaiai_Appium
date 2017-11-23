package com.appium.PageBeans.NewPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class ContactsPageBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView2;


    @Xpath(xpath={"//android.widget.HorizontalScrollView[@resource-id='com.zkj.guimi:id/message_tab']"})
    @Description(description="")
    public  View  horizontalScrollView3;


    @Xpath(xpath={"//android.widget.HorizontalScrollView[@resource-id='com.zkj.guimi:id/message_tab']/android.widget.LinearLayout[1]/android.widget.TextView[1]"})
    @Description(description="消息")
    public  PlainText  tab_new_txt;


    @Xpath(xpath={"//android.widget.TextView[@text='群组']"})
    @Description(description="群组")
    public  PlainText  tab_group_txt;


    @Xpath(xpath={"//android.widget.TextView[@text='联系人']"})
    @Description(description="联系人")
    public  PlainText  tab_contacts_txt;


    @Xpath(xpath={"//android.support.v4.view.ViewPager[@resource-id='com.zkj.guimi:id/message_viewpager']"})
    @Description(description="")
    public  View  viewPager4;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']"})
    @Description(description="")
    public  View  recyclerView5;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.TextView[@text='输入用户昵称或者爱爱号搜索']"})
    @Description(description="输入用户昵称或者爱爱号搜索")
    public  PlainText  search;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt' and @text='我的关注']"})
    @Description(description="我的关注")
    public  PlainText  myAttention;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[2]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[3]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt' and @text='我的粉丝']"})
    @Description(description="我的粉丝")
    public  PlainText  myFollow;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[3]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView10;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[4]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt' and @text='黑名单']"})
    @Description(description="黑名单")
    public  PlainText  myBlock;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[4]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  imageView12;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_0']/android.view.View[1]"})
    @Description(description="")
    public  View  view13;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_0']"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_0']"})
    @Description(description="搭讪")
    public  PlainText  accost;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_1']/android.view.View[1]"})
    @Description(description="")
    public  View  view15;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_1']"})
    @Description(description="")
    public  View  imageView16;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_1']"})
    @Description(description="发现")
    public  PlainText  find;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_3']/android.view.View[1]"})
    @Description(description="")
    public  View  view17;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_3']"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_2']/android.view.View[1]"})
    @Description(description="")
    public  View  view19;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_2']"})
    @Description(description="")
    public  View  imageView20;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_2']"})
    @Description(description="消息")
    public  PlainText  news;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_4']/android.view.View[1]"})
    @Description(description="")
    public  View  view21;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/animation_image_4']"})
    @Description(description="")
    public  View  imageView22;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_4']"})
    @Description(description="我")
    public  PlainText  mine;




    public ContactsPageBean(AppiumDriver aDriver){super(aDriver);}

}