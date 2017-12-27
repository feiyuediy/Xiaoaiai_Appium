package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.AttentionListPageBean;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class FansListPage {
    private AppiumDriver appiumDriver;
    private AttentionListPageBean attentionListPageBean;

    public FansListPage(AppiumDriver appiumDriver){
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

    //取消关注
    public void cancleAttention(String key) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String id = "com.zkj.guimi:id/name";
        List<WebElement> lists = appiumDriver.findElementsById(id);
        for (WebElement webElement : lists) {
            if (webElement.getText().equals(key)) {
                TouchAction touchAction = new TouchAction(appiumDriver);
                Duration duration = Duration.ofMillis(2);
                touchAction.longPress(webElement).waitAction(duration).perform();
                String cancle_fen_id = "com.zkj.guimi:id/ok";
                appiumDriver.findElementById(cancle_fen_id).click();
                break;
            }
        }
    }
}
