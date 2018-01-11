package com.appium.Pages.AccostPages;

import com.appium.PageBeans.AccostPageBeans.PhotoSelectBean;
import io.appium.java_client.AppiumDriver;

import java.util.Random;

/**
 * Created by admin on 2017/9/4.
 */
public class PhotoSelectPage {
    private PhotoSelectBean photoSelectBean;
    private AppiumDriver appiumDriver;

    public PhotoSelectPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        photoSelectBean = new PhotoSelectBean(appiumDriver);
    }

    public void selectPhoto(){
        photoSelectBean.toggleButton21.click();
        photoSelectBean.sure.click();
    }
    //随机选择i张相片
    public void select_photoByint(int i){
        int a = new Random().nextInt(6) + 1;
        int n[] = new int[i];
        for (int x = 0;x<i;x++){
            n[x]=a+x;
        }
        System.out.println(n.toString());
        for(int y:n){
            System.out.println(y);
            String xpath[] = {"//android.widget.GridView[@resource-id='com.zkj.guimi:id/photo_choice_grid']/android.widget.FrameLayout["+Integer.toString(y)+"]/android.widget.ToggleButton[1]"};
            String desc = "第"+Integer.toString(y)+"张图片";
            photoSelectBean.mySelect.setXpath(xpath);
            photoSelectBean.mySelect.setDescription(desc);
            photoSelectBean.mySelect.click();
        }
        photoSelectBean.sure.click();
    }
}
