package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.AttentionListPageBean;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlackListPage {
    private AppiumDriver appiumDriver;
    private AttentionListPageBean attentionListPageBean;

    public BlackListPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        attentionListPageBean = new AttentionListPageBean(appiumDriver);
    }

    //点击返回按钮
    public void click_back(){
        attentionListPageBean.back.click();
    }

    //获取第一个人的nick
    public String get_frist_nick(){
        return attentionListPageBean.name.getText();
    }

    //点击第一个人
    public void click_nick(){
        attentionListPageBean.name.click();
    }

    //判断拉黑列表是否为空
    public boolean isEmptyBlack(){
        WebElement webElement = appiumDriver.findElement(By.xpath("//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']"));
        int size = webElement.findElements(By.xpath("//android.widget.ListView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[1]")).size();
        System.out.println("size:"+size);
        if (size!=0){
            return false;
        }else {
            return true;
        }
    }
}
