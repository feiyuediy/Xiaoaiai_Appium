package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.GroupBean;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by admin on 2017/9/15.
 */
public class GroupPage {
    private AppiumDriver appiumDriver;
    private GroupBean groupBean;

    public GroupPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        groupBean = new GroupBean(appiumDriver);
    }

    //点击banner图
    public void click_banner(){
        groupBean.banner.click();
    }

    //点击我的第一个群组
    public void click_myFristGroup(){
        String id = "com.zkj.guimi:id/agl_image";
        List<WebElement> webElements = appiumDriver.findElementsById(id);
        webElements.get(0).click();
    }
    //点击我的第二个群组
    public void click_mySecGroup(){
        groupBean.secMyGroupName.click();
    }
    //获取第一个群组的名称
    public String get_myFristGroupName(){
        String id = "com.zkj.guimi:id/agl_image";
        List<WebElement> webElements = appiumDriver.findElementsById(id);
        return webElements.get(0).getText();
    }
    //获取第一个群组的描述
    public String get_myFristGroupDesc(){
        String id = "com.zkj.guimi:id/agl_tv_desc";
        List<WebElement> webElements = appiumDriver.findElementsById(id);
        return webElements.get(0).getText();
    }
    //点击全部群组
    public void click_allGroup(){
        groupBean.allGroup.click();
    }
    //点击第一个推荐群组
    public void click_fristRecommendGroup(){
        String id = "com.zkj.guimi:id/agl_image";
        List<WebElement> webElements = appiumDriver.findElementsById(id);
       webElements.get(0).click();
    }
    //获取第一个推荐群组的名称
    public  String get_fristRecommendGroupName(){
        String id = "com.zkj.guimi:id/agl_tv_title";
        List<WebElement> webElements = appiumDriver.findElementsById(id);
        return webElements.get(2).getText();
    }
    //获取第一个推荐群组的描述
    public String get_fristRecommendGroupDesc(){
        String id = "com.zkj.guimi:id/agl_tv_desc";
        List<WebElement> webElements = appiumDriver.findElementsById(id);
        return webElements.get(2).getText();
    }


}
