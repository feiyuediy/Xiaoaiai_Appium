package com.appium.Pages.FindPages;

import com.appium.PageBeans.FindPageBeans.UploadVideoBean;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/7.
 */
public class UploadVideoPage {
    private UploadVideoBean uploadVideoBean;
    private AppiumDriver appiumDriver;
    public UploadVideoPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        uploadVideoBean = new UploadVideoBean(appiumDriver);
    }

    public void click_back(){
        uploadVideoBean.back.click();
    }
    public void mix_music(){
        uploadVideoBean.mix_music.click();
    }
    public void cuc_img(){
        uploadVideoBean.img_cut.click();
    }
    public void click_upload(){
        uploadVideoBean.upload.click();
    }
    public void add_content(String text){
        uploadVideoBean.video_content.input(text);
    }
    //判断上传进度条是否存在
    public boolean isDialog_progressbarExit(){
        if (uploadVideoBean.dialog_progressbar.isExists()){
            return true;
        }else {
            return false;
        }
    }
    //判断上传成功弹窗是否存在
    public boolean isOkExit(){
        uploadVideoBean.dc_dialog_btn_ok.expectElementExistOrNot(true,30000);
        if (uploadVideoBean.dc_dialog_btn_ok.isExists()){
            return true;
        }else {
            return false;
        }
    }
    //点击上传成功弹窗中的我知道了
    public void click_ok(){
        uploadVideoBean.dc_dialog_btn_ok.click();
    }
    //获取上传成功的文字
    public String get_ok_title(){
        uploadVideoBean.dc_dialog_btn_ok.expectElementExistOrNot(true,30000);
        return uploadVideoBean.dc_dialog_txt_content.getText();
    }
}
