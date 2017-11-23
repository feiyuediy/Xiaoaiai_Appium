package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.GroupBean;
import com.appium.PageBeans.NewPageBeans.GroupInfoBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/21.
 */
public class GroupInfoPage {
    private GroupInfoBean groupInfoBean;
    private AppiumDriver appiumDriver;

    public GroupInfoPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        groupInfoBean = new GroupInfoBean(appiumDriver);
    }

    //点击返回按钮
    public void click_back(){
        groupInfoBean.back.click();
    }

    //获取title
    public String get_title(){
        return groupInfoBean.title.getText();
    }

    //获取群名称
    public String get_group_name(){
        return groupInfoBean.group_name.getText();
    }

    //点击群名称
    public void click_group_name(){
        groupInfoBean.group_name.click();
    }

    //修改群名称
    public void modify_group_name(String txt){
        click_group_name();
        ModifyGroupNamePage modifyGroupNamePage = new ModifyGroupNamePage(appiumDriver);
        modifyGroupNamePage.modify_group_name(txt);
    }
    //获取群号
    public String get_group_id(){
        return groupInfoBean.group_id.getText();
    }

    //点击群号
    public void click_group_id(){
        groupInfoBean.group_id.click();
    }
    //获取群等级
    public String get_group_level(){
        return groupInfoBean.level.getText();
    }

    //点击群等级
    public void click_group_level(){
        groupInfoBean.level.click();
    }

    //获取群介绍
    public String get_group_desc(){
        return groupInfoBean.group_desc.getText();
    }

    //点击群介绍
    public void click_group_desc(){
        groupInfoBean.group_desc.click();
    }

    //修改群介绍
    public void modify_group_desc(String desc){
        groupInfoBean.group_desc.click();
        ModifyGroupDescPage modifyGroupDescPage = new ModifyGroupDescPage(appiumDriver);
        modifyGroupDescPage.modifyGroupDesc(desc);
    }

    //获取群主昵称
    public String get_group_owner(){
        return groupInfoBean.group_owner.getText();
    }

    //获取群人员数
    public String get_group_number(){
        return groupInfoBean.current_number.getText();
    }

    //点击群成员中一员
    public void click_group_number_list(){
        groupInfoBean.group_people_list_member_1.click();
    }

    //点击加群申请
    public void click_add_requst(){
        groupInfoBean.additionalGroupRequest_tab.click();
    }
    //判断加群申请项是否存在
    public boolean isExitAddRequest(){
        return groupInfoBean.additionalGroupRequest_tab.isExists();
    }
    //获取群公告
    public String get_group_notice(){
        return groupInfoBean.group_notice.getText();
    }
    //点击群公告
    public void click_group_notice(){
        groupInfoBean.group_notice.click();
    }
    //修改群公告
    public void modify_group_notice(String desc){
        groupInfoBean.group_notice.click();
        ModifyGroupNoticePage modifyGroupNoticePage = new ModifyGroupNoticePage(appiumDriver);
        modifyGroupNoticePage.modify_group_notice(desc);
    }
    //打开消息置顶
    public void open_news_top(){
        String is = groupInfoBean.news_top_btn.toWebElement().getAttribute("checked");
        System.out.println(is);
        if (!is.equals("true")){
            groupInfoBean.news_top_btn.click();
        }
    }

    //关闭消息置顶
    public void close_news_top(){
        String is = groupInfoBean.news_top_btn.toWebElement().getAttribute("checked");
        System.out.println(is);
        if (is.equals("true")){
            groupInfoBean.news_top_btn.click();
        }
    }

}
