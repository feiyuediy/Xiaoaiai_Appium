package com.appium.PageBeans.AccostPageBeans;
import lazy.android.annotations.*;
import lazy.android.bean.BaseBean;
import lazy.android.controls.*;
import io.appium.java_client.AppiumDriver;


public class UploadIdphotoBean extends BaseBean{


    @Xpath(xpath={"//android.widget.FrameLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view11;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/action_bar_overlay_layout']"})
    @Description(description="")
    public  View  view21;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/action_bar']"})
    @Description(description="")
    public  View  view3;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="ID照上传")
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


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/aeip_img']"})
    @Description(description="")
    public  View  idphoto;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_tip']"})
    @Description(description="审核通过")
    public  PlainText  aeip_tile;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/aeip_divid_line']"})
    @Description(description="")
    public  View  view7;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_1']"})
    @Description(description="1. 照片内必须显示当前爱爱号；")
    public  PlainText  textView4;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_2']"})
    @Description(description="2. 须展示清晰的头部或其他身体部位；")
    public  PlainText  textView5;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_3']"})
    @Description(description="3. 不得盗用他人图片，或上传露点及其他违规内容；")
    public  PlainText  textView6;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_4']"})
    @Description(description="4. ID照需经过人工审核，以审核结果为准；")
    public  PlainText  textView7;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_5']"})
    @Description(description="5. 审核通过后可以更新您的ID照。")
    public  PlainText  textView8;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_photo_tv']"})
    @Description(description="更新ID照")
    public  PlainText  upIdpthotoButoon;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_delete']"})
    @Description(description="删除")
    public  PlainText  delectIdphoto;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_camera']"})
    @Description(description="拍照")
    public  PlainText  camera;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_select_from_phone']"})
    @Description(description="从相机中选择")
    public  PlainText  selectphone;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_cancel']"})
    @Description(description="取消")
    public  PlainText  clance;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dc_dialog_txt_content']"})
    @Description(description="您确认要删除已选ID照？")
    public  PlainText  tips;


    @Xpath(xpath={"//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[1]"})
    @Description(description="")
    public  View  view1;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_cancel']"})
    @Description(description="取消")
    public  Click  delectCanleButton;


    @Xpath(xpath={"//android.view.View[@resource-id='com.zkj.guimi:id/dc_dialog_view_line_v']"})
    @Description(description="")
    public  View  view2;


    @Xpath(xpath={"//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']"})
    @Description(description="确定")
    public  Click  delectSureButton;

    public UploadIdphotoBean(AppiumDriver aDriver){super(aDriver);}

}