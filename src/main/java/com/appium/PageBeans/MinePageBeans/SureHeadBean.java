package com.appium.PageBeans.MinePageBeans;

import com.lazy.annotations.Description;
import com.lazy.annotations.Xpath;
import com.lazy.bean.BaseBean;
import com.lazy.controls.PlainText;
import com.lazy.controls.View;
import io.appium.java_client.AppiumDriver;


public class SureHeadBean extends BaseBean {


    @Xpath(xpath={"//android.widget.TextView[@text='取消']"})
    @Description(description="取消")
    public PlainText cancle;


    @Xpath(xpath={"//android.widget.TextView[@text='确定']"})
    @Description(description="确定")
    public  PlainText  sure;


    @Xpath(xpath={"//android.widget.ImageView[@resource-id='com.zkj.guimi:id/crop_image']"})
    @Description(description="")
    public View imageView1;


    @Xpath(xpath={"//android.view.View[@resource-id='android:id/statusBarBackground']"})
    @Description(description="")
    public  View  view2;




    public SureHeadBean(AppiumDriver aDriver){super(aDriver);}

}