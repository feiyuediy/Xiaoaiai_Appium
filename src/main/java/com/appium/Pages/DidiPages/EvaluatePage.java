package com.appium.Pages.DidiPages;

import com.appium.PageBeans.DidiPageBeans.EvaluatePageBean;
import com.appium.Utils.Common;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;

public class EvaluatePage {
    private AppiumDriver appiumDriver;
    private EvaluatePageBean evaluatePageBean;

    public EvaluatePage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        evaluatePageBean = new EvaluatePageBean(appiumDriver);
    }

    //点击返回按钮
    public void click_back(){
        evaluatePageBean.txt_left.click();
    }

    //获取title
    public String get_title(){
        return evaluatePageBean.txt_title.getText();
    }

    //获取评价人的昵称
    public String get_nick(){
        return evaluatePageBean.name_tv.getText();
    }

    //评价分数
    public void evaluteStar(int star){
        switch (star){
            case 1:
                evaluatePageBean.oneStar.click();
                break;
            case 2:
                evaluatePageBean.twoStar.click();
                break;
            case 3:
                evaluatePageBean.threeStar.click();
                break;
            case 4:
                evaluatePageBean.fourStar.click();
                break;
            case 5:
                evaluatePageBean.fiveStar.click();
                break;
        }
        try{
            click_submit();
        }catch (Exception e){
            DriverCommon.swipeToUp(appiumDriver, 2000,1);
            click_submit();
        }

    }

    //点击提交
    public void click_submit(){
        evaluatePageBean.submit_btn.click();
    }


}
