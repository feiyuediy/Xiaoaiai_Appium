package com.appium.Pages.FindPages;

import com.appium.PageBeans.FindPageBeans.VideoFeedBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/13.
 */
public class VideoFeedPage {
    private AppiumDriver appiumDriver;
    private VideoFeedBean videoFeedBean;

    public VideoFeedPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        videoFeedBean = new VideoFeedBean(appiumDriver);
    }

    //点击第N条动态
    public void cilck_videoFeed(int i){
        String[] xpath = {"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.ImageView[1]"};
        String desc = "第N条视频动态";
        videoFeedBean.videoFeed.setXpath(xpath);
        videoFeedBean.videoFeed.setDescription(desc);
        videoFeedBean.videoFeed.click();
    }

    //获取第N条动态的用户名
    public String getNick(int i){
        String[] xpath = {"\t//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"};
        String desc = "第N条视频动态的发布人";
        videoFeedBean.videoFeedName.setXpath(xpath);
        videoFeedBean.videoFeedName.setDescription(desc);
        return videoFeedBean.videoFeedName.getText();
    }
}
