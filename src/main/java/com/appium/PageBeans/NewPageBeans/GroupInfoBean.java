package com.appium.PageBeans.NewPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;
import com.lazy.controls.Click;
import com.lazy.controls.PlainText;import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class GroupInfoBean extends BaseBean{


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
    @Description(description="群资料")
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


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_group']"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.ScrollView/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view7;


    @Xpath(xpath={"//android.widget.TextView[@text='群  名  称']"})
    @Description(description="群  名  称")
    public  PlainText  group_name_tab;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/agi_group_name_text']"})
    @Description(description="武神")
    public  PlainText  group_name;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_name_arrow']"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.widget.ScrollView/android.widget.LinearLayout[1]/android.view.View[2]"})
    @Description(description="")
    public  View  view9;


    @Xpath(xpath={"//android.widget.TextView[@text='群        号']"})
    @Description(description="群        号")
    public  PlainText  group_id_tab;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/agi_tv_group_id']"})
    @Description(description="88")
    public  PlainText  group_id;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/level']"})
    @Description(description="3")
    public  PlainText  level;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[3]"})
    @Description(description="")
    public  View  view10;


    @Xpath(xpath={"//android.widget.TextView[@text='群  介  绍']"})
    @Description(description="群  介  绍")
    public  PlainText  group_desc_tab;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/agi_tv_group_desc']"})
    @Description(description="德玛西亚之力")
    public  PlainText  group_desc;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_introduction_arrow']"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[4]"})
    @Description(description="")
    public  View  view12;


    @Xpath(xpath={"//android.widget.TextView[@text='群        主']"})
    @Description(description="群        主")
    public  PlainText  group_owner_tab;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_group_owner_vip']"})
    @Description(description="")
    public  View  imageView13;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_group_owner']"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/agi_tv_group_owner']"})
    @Description(description="让人阿爸")
    public  PlainText  group_owner;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[5]"})
    @Description(description="")
    public  View  view15;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/agi_tv_current_number']"})
    @Description(description="38")
    public  PlainText  current_number;


    @Xpath(xpath={"//android.widget.TextView[@text='群组成员']"})
    @Description(description="群组成员")
    public  PlainText  group_people_list_tab;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_vip_1']"})
    @Description(description="")
    public  View  imageView16;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_member_1']"})
    @Description(description="")
    public  View  group_people_list_member_1;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_vip_2']"})
    @Description(description="")
    public  View  imageView18;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_member_2']"})
    @Description(description="")
    public  View  group_people_list_member_2;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_vip_3']"})
    @Description(description="")
    public  View  imageView20;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_member_3']"})
    @Description(description="")
    public  View  group_people_list_member_3;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_member_4']"})
    @Description(description="")
    public  View  group_people_list_member_4;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_image_member_5']"})
    @Description(description="")
    public  View  group_people_list_member_5;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/agi_group_member_layout']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView24;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[6]"})
    @Description(description="")
    public  View  view25;


    @Xpath(xpath={"//android.widget.TextView[@text='加群申请']"})
    @Description(description="加群申请")
    public  PlainText  additionalGroupRequest_tab ;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/agi_layout_pend_msg']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView26;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/agi_view_notice_line_below']"})
    @Description(description="")
    public  View  view27;


    @Xpath(xpath={"//android.widget.TextView[@text='群  公  告']"})
    @Description(description="群  公  告")
    public  PlainText  groupNotice_tab;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/agi_group_notice_txt']"})
    @Description(description="滕王阁序")
    public  PlainText  group_notice;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/agi_group_notice_arrow']"})
    @Description(description="")
    public  View  imageView28;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/agi_view_notice_line']"})
    @Description(description="")
    public  View  view29;


    @Xpath(xpath={"//android.widget.TextView[@text='消息置顶']"})
    @Description(description="消息置顶")
    public  PlainText  news_top_tab;


    @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/ascs_news_top_btn']"})
    @Description(description="")
    public  View  news_top_btn;




    @Xpath(xpath={"//android.widget.TextView[@text='消息免打扰']"})
    @Description(description="消息免打扰")
    public  PlainText  news_notice_tab;


    @Xpath(xpath={"//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/ascs_news_notice_btn']"})
    @Description(description="")
    public  View  news_notice_btn;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/agi_extra_setting_layout']/android.view.View[2]"})
    @Description(description="")
    public  View  view33;


    @Xpath(xpath={"//android.widget.TextView[@text='设置当前聊天背景']"})
    @Description(description="设置当前聊天背景")
    public  PlainText  group_bg_setting_tab;


    @Xpath(xpath={"//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/agi_group_bg_setting_layout']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView34;

    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[7]"})
    @Description(description="")
    public  View  view31;


    @Xpath(xpath={"//android.widget.TextView[@text='创建时间']"})
    @Description(description="创建时间")
    public  PlainText  create_time_tab;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/agi_tv_create_time']"})
    @Description(description="2016-09-12")
    public  PlainText  create_time;


    @Xpath(xpath={"//android.widget.LinearLayout/android.view.View[8]"})
    @Description(description="")
    public  View  view32;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/agi_btn_join_group']"})
    @Description(description="退出该群")
    public Click join_group;




    public GroupInfoBean(AppiumDriver aDriver){super(aDriver);}

}