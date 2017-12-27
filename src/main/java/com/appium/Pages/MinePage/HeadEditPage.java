package com.appium.Pages.MinePage;

import com.appium.PageBeans.MinePageBeans.HeadEditBean;
import com.appium.PageBeans.MinePageBeans.SureHeadBean;
import com.appium.Pages.AccostPages.PhotoSelectPage;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeadEditPage {
    private AppiumDriver appiumDriver;
    private HeadEditBean headEditBean;
    private static String headId = "com.zkj.guimi:id/vhgi_img_head";

    public HeadEditPage(AppiumDriver appiumDriver1){
        appiumDriver = appiumDriver1;
        headEditBean = new HeadEditBean(appiumDriver);
    }

    //点击保存按钮
    public void click_save(){
        headEditBean.save.click();
    }

    //点击返回按钮
    public void click_back(){
        headEditBean.back.click();
    }

    //增加一个头像,i为选择第几张图片
    public void add_head(int i){
        DriverCommon.goSleep(1);

        List<WebElement> lists = appiumDriver.findElements(By.id(headId));
        int size = lists.size();
        WebElement add = lists.get(size-1);
        add.click();
        headEditBean.dchi_tv_select_from_phone.click();
        //进入到图片选择页面
        PhotoSelectPage photoSelectPage = new PhotoSelectPage(appiumDriver);
        photoSelectPage.select_photoByint(i);

        SureHeadBean headBean = new SureHeadBean(appiumDriver);
        headBean.sure.click();

    }
    //获取当前头像个数
    public int get_headImgNum(){
        DriverCommon.goSleep(1);
        List<WebElement> list = appiumDriver.findElementsById(headId);
        return list.size()-1;
    }

    //删除一个头像
    public void delectHeadImg(int i){
        List<WebElement> list = appiumDriver.findElementsById(headId);
        list.get(i-1).click();
        headEditBean.dchi_tv_delete.click();
    }

}
