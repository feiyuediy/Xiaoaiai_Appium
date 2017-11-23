package com.appium.Pages.MinePage;

import com.appium.PageBeans.MinePageBeans.MineBean;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by admin on 2017/8/30.
 */
public class MinePage {
    private AppiumDriver appiumDriver;
    private MineBean mineBean;

    public MinePage(AppiumDriver appiumDriver1){
        appiumDriver = appiumDriver1;
        mineBean = new MineBean(appiumDriver);
    }
    //进入个人资料
    public void goAccountPage(){
        mineBean.nickName.click();
    }
    //进入充值界面
    public void goRechargePage(){
        mineBean.rechargeCenter.click();
    }
    //进入会员中心
    public void goVipPage(){
        mineBean.vipCeanter.click();
    }
    //进入成长中心
    public void goGrowupPage(){
        mineBean.growupCenter.click();
    }
    //进入游戏大厅
    public void goGamePage(){
        mineBean.gameCenter.click();
    }
    //进入许愿夺宝
    public void goWishPage(){
        mineBean.wishCenter.click();
    }
    //进入设置
    public void goSettingPage(){
        mineBean.Setting.click();
    }
    //进入帮助中心
    public void goHelp(){
        mineBean.help.click();
    }
    //进入反馈
    public void goFeedback(){
        mineBean.feedback.click();
    }

    //获取爱爱豆数量
    public int get_remaind_aiai(){
        goAccountPage();
        UserInfoPage userInfoPage = new UserInfoPage(appiumDriver);
        userInfoPage.click_back();
        String id = "com.zkj.guimi:id/vii_tv_content";
        List<WebElement> list = appiumDriver.findElementsById(id);
        WebElement webElement = list.get(0);
        String s = webElement.getText();
        int i = Integer.valueOf(s.split("爱爱豆")[0]);
        System.out.println(i);
        return i;
    }
}
