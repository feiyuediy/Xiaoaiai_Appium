package com.appium.PageBeans.MinePageBeans;



import com.lazy.annotations.Description;
import com.lazy.annotations.Xpath;
import com.lazy.bean.BaseBean;
import com.lazy.controls.PlainText;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class HeadEditBean extends BaseBean {


    @Xpath(xpath={"//android.view.ViewGroup[@resource-id='android:id/decor_content_parent']"})
    @Description(description="")
    public View viewGroup1;


    @Xpath(xpath={"//android.view.ViewGroup[@resource-id='android:id/action_bar']"})
    @Description(description="")
    public  View  viewGroup2;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']"})
    @Description(description="头像")
    public PlainText title;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']"})
    @Description(description="")
    public  View  imageView3;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']"})
    @Description(description="返回")
    public  PlainText  back;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']"})
    @Description(description="保存")
    public  PlainText  save;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right_3']"})
    @Description(description="")
    public  View  imageView4;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/ah_gridview']"})
    @Description(description="")
    public  View  gridView5;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/ah_gridview']/android.widget.LinearLayout[1]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView6;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/ah_gridview']/android.widget.LinearLayout[2]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView7;


    @Xpath(xpath={"//android.widget.GridView[@resource-id='com.zkj.guimi:id/ah_gridview']/android.widget.LinearLayout[3]/android.widget.ImageView[1]"})
    @Description(description="")
    public  View  imageView8;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/statusBarBackground']"})
    @Description(description="")
    public  View  view9;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_camera']"})
    @Description(description="")
    public  View  dchi_tv_camera;


    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_cancel']"})
    @Description(description="")
    public  View  dchi_tv_cancel;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_select_from_phone']"})
    @Description(description="")
    public  View  dchi_tv_select_from_phone;

    @Xpath(xpath={"//android.widget.TextView[@resource-id='com.zkj.guimi:id/dchi_tv_delete']"})
    @Description(description="")
    public  View  dchi_tv_delete;

    public HeadEditBean(AppiumDriver aDriver){super(aDriver);}

}