package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.ContactsPageBean;
import com.appium.PageBeans.NewPageBeans.SearchPageBean;
import com.appium.Pages.MinePage.OtherUserInfoPage;
import io.appium.java_client.AppiumDriver;

public class ContactsPage {
    private AppiumDriver appiumDriver;
    private ContactsPageBean contactsPageBeas;
    private SearchPageBean searchPageBean;

    public ContactsPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        contactsPageBeas = new ContactsPageBean(appiumDriver);
        searchPageBean = new SearchPageBean(appiumDriver);
    }

    //点击我的关注
    public void click_myAttountion(){
        contactsPageBeas.myAttention.click();
    }

    //点击我的粉丝
    public void click_myFans(){
        contactsPageBeas.myFollow.click();
    }

    //点击黑名单
    public void click_myBlock(){
        contactsPageBeas.myBlock.click();
    }

    //搜索并关注
    public void searchAndAttention(String key){
        //搜索
        contactsPageBeas.search.click();
        searchPageBean.serchEdit.input(key);
        searchPageBean.search_network.click();
        searchPageBean.user_has_find.click();

        //关注
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(appiumDriver);
        otherUserInfoPage.attention();

        //返回到搜索页面
        otherUserInfoPage.click_back();
        searchPageBean.back.click();
        searchPageBean.back.click();
    }

    //搜索并拉黑
    public void searchAndblock(String key){
        //搜索
        contactsPageBeas.search.click();
        searchPageBean.serchEdit.input(key);
        searchPageBean.search_network.click();

        //拉黑
        OtherUserInfoPage otherUserInfoPage = new OtherUserInfoPage(appiumDriver);
        otherUserInfoPage.backOrUnback();

        //返回到搜索页面
        otherUserInfoPage.click_back();
        searchPageBean.back.click();
    }

}
