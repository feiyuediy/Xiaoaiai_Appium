package com.appium.Pages.FindPages;

import com.appium.PageBeans.FindPageBeans.LoadVideoBean;
import io.appium.java_client.AppiumDriver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2017/9/7.
 */
public class LoadVideoPage{
    private LoadVideoBean loadVideoBean;
    private AppiumDriver appiumDriver;
    public LoadVideoPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        loadVideoBean = new LoadVideoBean(appiumDriver);
    }

    public void click_back(){
        loadVideoBean.back.click();
    }

    public void click_cancle(){
        loadVideoBean.cancle.click();
    }

    public void click_fristVideo(){
        loadVideoBean.fristVideo.click();
    }

    public void click_machTimeVideo(){
        for (int i=1;i<=12;i++){
            System.out.println("i="+i);
            String[] xpath = {"//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.GridView[1]/android.widget.FrameLayout["+Integer.toString(i)+"]/android.widget.LinearLayout[1]/android.widget.TextView[1]"};
            String desc = "";
            loadVideoBean.time.setXpath(xpath);
            loadVideoBean.time.setDescription(desc);
            String time = loadVideoBean.time.getText();
            if (isTimeMatch(time)){
                loadVideoBean.time.click();
                break;
            }
        }
    }

    public boolean isTimeMatch(String time){
        System.out.println("time:"+time);
        String x = time.split(":")[0];
        System.out.println("time.splt:"+x);
        String[] y = {"00","01"};
        Set<String> set = new HashSet<String>(Arrays.asList(y));
        return set.contains(x);
    }
}
