package com.appium.Pages.AccostPages;

import com.appium.PageBeans.AccostPageBeans.idPhotoBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/4.
 */
public class IDphotoPage {
    private idPhotoBean idphotoBean;
    private AppiumDriver appiumDriver;

    public IDphotoPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        idphotoBean = new idPhotoBean(appiumDriver);
    }
    //点击上传按钮
    public void click_upload(){
        idphotoBean.upload.click();
    }
    //获取title
    public String getTile(){
        return idphotoBean.title.getText();
    }
    //切换榜单
    public void changeList(String name){
        idphotoBean.rightTable.click();
        switch (name){
            case "最近在线":
                idphotoBean.newUpdata.click();
                break;
            case "最近注册":
                idphotoBean.newReght.click();
                break;
            case "最近更新":
                idphotoBean.newUpdata.click();
                break;
            case "进入热门":
                idphotoBean.todatHot.click();
        }
    }
    //点击第N个人的id照
    public void click_idphoto(){
        idphotoBean.fristidPhtot.click();
    }
}
