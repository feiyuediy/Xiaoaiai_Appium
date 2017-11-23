package com.appium.Pages.NewsPages;

import com.appium.PageBeans.NewPageBeans.ModifyGroupNoticeBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/21.
 */
public class ModifyGroupNoticePage {
    private AppiumDriver appiumDriver;
    private ModifyGroupNoticeBean modifyGroupNoticeBean;

    public ModifyGroupNoticePage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        modifyGroupNoticeBean = new ModifyGroupNoticeBean(appiumDriver);
    }

    //修改群公告
    public void modify_group_notice(String notice){
        modifyGroupNoticeBean.edit.click();
        modifyGroupNoticeBean.notice_content.clear();
        modifyGroupNoticeBean.notice_content.input(notice);
        modifyGroupNoticeBean.submit.click();
        modifyGroupNoticeBean.dialog_btn_submit.click();
        modifyGroupNoticeBean.dialog_btn_ok.click();
        modifyGroupNoticeBean.back.click();
    }
}
