package com.appium.Pages.FindPages;

import com.appium.PageBeans.FindPageBeans.ThemeFeedsBean;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by admin on 2017/9/8.
 */
public class ThemeFeedsPage {
    private ThemeFeedsBean themeFeedsBean;
    private AppiumDriver appiumDriver;
    public ThemeFeedsPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        themeFeedsBean = new ThemeFeedsBean(appiumDriver);
    }

    //获取页面title
    public String getTitle(){
        return themeFeedsBean.title.getText();
    }
    //获取页面第一条动态的昵称
    public String getFristFeedNick(){
        return themeFeedsBean.af_tv_name.getText();
    }

    //获取第一条动态的内容
    public String getContent(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpth = "com.zkj.guimi:id/af_tv_content";
        List<WebElement> list = appiumDriver.findElementsById(xpth);
        WebElement webElement = list.get(0);
        return webElement.getText();
    }
}
