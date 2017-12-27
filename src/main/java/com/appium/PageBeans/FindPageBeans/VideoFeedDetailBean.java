package com.appium.PageBeans.FindPageBeans;
import com.lazy.annotations.Description;import com.lazy.annotations.Xpath;import com.lazy.bean.BaseBean;
import com.lazy.controls.Click;
import com.lazy.controls.PlainText;
import com.lazy.controls.Text;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class VideoFeedDetailBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']"})
    @Description(description="")
    public  View  recyclerView2;


    @Xpath(xpath={"//android.widget.FrameLayout[@resource-id='com.zkj.guimi:id/lvfdh_video_player']/android.view.View[1]"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.ProgressBar[@resource-id='com.zkj.guimi:id/lvfdh_bottom_progressbar']"})
    @Description(description="")
    public  View  progressBar4;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_image_header']"})
    @Description(description="")
    public  View  headImg;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_name']"})
    @Description(description="Vivi")
    public  PlainText  name;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_level']"})
    @Description(description="3")
    public  PlainText  level;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_img_gender']"})
    @Description(description="")
    public  View  genderImg;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_value']"})
    @Description(description="26280")
    public  PlainText  tv_value;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_img_follow']"})
    @Description(description="")
    public  View  followImg;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_img_close']"})
    @Description(description="")
    public  View  close;

    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/play_img']"})
    @Description(description="")
    public  View  play;

    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/lvfdh_layout_gift_title']/android.view.View[1]"})
    @Description(description="")
    public  View  view5;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/lvfdh_layout_gift_title']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvfdh_tv_get_gift_total']"})
    @Description(description="收到礼物（2）")
    public  PlainText  textView2;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/lvfdh_layout_gift_title']/android.view.View[2]"})
    @Description(description="")
    public  View  view7;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']"})
    @Description(description="")
    public  View  gridView8;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView9;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  gift_list_headImg;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView11;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]"})
    @Description(description="")
    public  View  moreGift;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/layout_label_time']/android.view.View[1]"})
    @Description(description="")
    public  View  view13;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/layout_label_time']/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView14;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/timestamp' and @text='08月18日 14:33']"})
    @Description(description="08月18日 14:33")
    public  PlainText  feedTime;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/report']"})
    @Description(description="举报")
    public  PlainText  report;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/other']/android.view.View[1]"})
    @Description(description="")
    public  View  view15;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/iv_gift']"})
    @Description(description="")
    public  View  giftImg;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_gift']"})
    @Description(description="2")
    public  PlainText  giftNum;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/iv_like']"})
    @Description(description="")
    public  View  likeImg;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_like']"})
    @Description(description="1")
    public  PlainText  likeNum;


    @Xpath(xpath={"//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/other']/android.widget.ImageView[3]"})
    @Description(description="")
    public  View  commentImg;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_comment']"})
    @Description(description="1")
    public  PlainText  commentNUM;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view19;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[2]"})
    @Description(description="")
    public  View  view20;


    @Xpath(xpath={"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView21;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/sign']"})
    @Description(description="")
    public  View  imageView22;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avatar']"})
    @Description(description="")
    public  View  imageView23;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/name']"})
    @Description(description="156大哥")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/comment']"})
    @Description(description="妈呀")
    public  PlainText  textView9;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/timestamp' and @text='08月21日 10:52']"})
    @Description(description="08月21日 10:52")
    public  PlainText  textView10;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.view.View[1]"})
    @Description(description="")
    public  View  view24;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_image_header']"})
    @Description(description="")
    public  View  imageView25;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_name']"})
    @Description(description="sina")
    public  PlainText  textView11;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_level']"})
    @Description(description="9")
    public  PlainText  textView12;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_img_gender']"})
    @Description(description="")
    public  View  imageView26;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_value']"})
    @Description(description="2202731")
    public  PlainText  textView13;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_img_follow']"})
    @Description(description="")
    public  View  imageView27;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_img_close']"})
    @Description(description="")
    public  View  imageView28;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avfd_img_gift']"})
    @Description(description="")
    public  View  giveGiftImg;


    @Xpath(xpath={"//android.widget.EditText[@resource-id='com.zkj.guimi:id/edit_text']"})
    @Description(description="")
    public Text commontEdit;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/edit_hint']"})
    @Description(description="")
    public  PlainText  textView14;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/avfd_btn_comment']"})
    @Description(description="评论")
    public Click commontButton;


    public VideoFeedDetailBean(AppiumDriver aDriver){super(aDriver);}

}