package com.appium.PageBeans.NewPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;
import com.lazy.controls.*;
import io.appium.java_client.AppiumDriver;


public class SendGiftBean extends BaseBean{


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
    @Description(description="发礼包")
    public  PlainText  title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="说明")
    public  PlainText  explanation;


    @Xpath(xpath={"//android.widget.ScrollView[@resource-id='com.zkj.guimi:id/scroll']"})
    @Description(description="")
    public  View  scrollView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/gift_type_desc']"})
    @Description(description="选择礼物类型")
    public  PlainText  gift_type_desc;


    @Xpath(xpath={"//android.widget.Spinner[@resource-id='com.zkj.guimi:id/gift_type']"})
    @Description(description="")
    public Select gift_type;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/name']"})
    @Description(description="海洋之心")
    public  PlainText  name;


    @Xpath(xpath={"//android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/gift_num_desc']"})
    @Description(description="礼物总数")
    public  PlainText  gift_num_desc;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/gift_num']"})
    @Description(description="1")
    public Text gift_num;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/fen']"})
    @Description(description="份")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.TextView[@text='参与人员']"})
    @Description(description="参与人员")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/asg_join_num_txt']"})
    @Description(description="全部成员（38人）")
    public  PlainText  asg_join_num_txt;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/asg_pink_arrow_img']"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/pack_num_desc']"})
    @Description(description="礼包个数")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/pack_num']"})
    @Description(description="1")
    public  Text  pack_num;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/ge']"})
    @Description(description="个")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/desc']"})
    @Description(description="人人有礼，见者有份！")
    public  Text  desc;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/info']"})
    @Description(description="总价值：13140爱爱豆")
    public  PlainText  info;


    @Xpath(xpath={"//android.widget.CheckBox[@resource-id='com.zkj.guimi:id/notice_cb']"})
    @Description(description="")
    public Click notice_cb;


    @Xpath(xpath={"//android.widget.TextView[@text='公告']"})
    @Description(description="公告")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/send']"})
    @Description(description="确认发送")
    public  Click  send;


    @Xpath(xpath={"//android.widget.TextView[@text='未领取的礼包，24小时后将被系统回收']"})
    @Description(description="未领取的礼包，24小时后将被系统回收")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.widget.TextView[@text='普通礼物1']"})
    @Description(description="普通礼物1")
    public  PlainText  gift;


    public SendGiftBean(AppiumDriver aDriver){super(aDriver);}

}