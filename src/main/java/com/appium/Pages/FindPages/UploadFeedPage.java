package com.appium.Pages.FindPages;

import com.appium.PageBeans.FindPageBeans.UploadFeedBean;
import com.appium.PageBeans.FindPageBeans.UploadVideoBean;
import com.appium.Pages.AccostPages.PhotoSelectPage;
import com.appium.Utils.DriverCommon;
import io.appium.java_client.AppiumDriver;

/**
 * Created by admin on 2017/9/8.
 */
public class UploadFeedPage {
    private UploadFeedBean uploadFeedBean;
    private AppiumDriver appiumDriver;

    public UploadFeedPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        uploadFeedBean = new UploadFeedBean(appiumDriver);
    }

    //点击返回按钮
    public void click_back(){
        uploadFeedBean.back.click();
    }
    //点击发布按钮
    public void click_upload(){
        uploadFeedBean.upload.click();
    }
    //获取页面title
    public String getTitle(){
        return uploadFeedBean.title.getText();
    }
    //获取剩余字数
    public String get_content_length(){
        return uploadFeedBean.apn_tv_content_length.getText();
    }
    //获取图片剩余张数
    public String get_pic_length(){
        return uploadFeedBean.apn_tv_pic_num_tips.getText();
    }

    //获取默认编辑文字
    public String get_et_news(){
        return uploadFeedBean.apn_et_news.getText();
    }

    //输入文字
    public void editNews(String text){
        uploadFeedBean.apn_et_news.clear();
        uploadFeedBean.apn_et_news.input(text);
    }

    //根据话题标签选择一个标签
    public void select_topicByText(String text){
        String[] xpath = {"//android.widget.TextView[@text='"+text+"']"};
        uploadFeedBean.textTopic.setXpath(xpath);
        uploadFeedBean.textTopic.setDescription(text);
        uploadFeedBean.textTopic.click();
    }

    //根据话题标签选择一个标签
    public void select_topicByInt(int i){
        String[] xpath = {"//android.widget.FrameLayout[1]/android.view.View[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.TextView[1]\n"};
        uploadFeedBean.intTopic.setXpath(xpath);
        uploadFeedBean.intTopic.setDescription("第"+Integer.toString(i)+"个话题");
        uploadFeedBean.intTopic.click();
    }

    //点击添加图片
    public void click_add_pic(){
        uploadFeedBean.apf_feeds_img.click();
    }

    //点击匿名
    public void click_anonymity(){
        uploadFeedBean.apn_image_anonymity.click();
    }

    //获取公告
    public String get_tips(){
        return uploadFeedBean.apngl_post_feeds_tips.getText();
    }

    //点击拍照
    public void click_camera(){
        uploadFeedBean.camera.click();
    }
    //点击从手机相册选择
    public void click_select_photo(){
        uploadFeedBean.select_from_phone.click();
    }
    //点击取消
    public void click_cancel(){
        uploadFeedBean.cancel.click();
    }

    //点击弹窗中的我知道了
    public void click_dialog_ok(){
        uploadFeedBean.dialog_btn_ok.click();
    }
    //获取弹窗中的提示语
    public String get_dialog_txt(){
        return uploadFeedBean.dialog_txt_content.getText();
    }
    //判断不能发布空的动态弹窗是否存在
    public boolean isExitDialog(){
        if (uploadFeedBean.dialog_txt_content.isExists()){
            return true;
        }else {
            return false;
        }
    }

    //选择N张相片
    public void select_photo_pic(int i){
        click_add_pic();
        click_select_photo();
        //处理权限弹窗
        DriverCommon.Hand_permission(appiumDriver);
        PhotoSelectPage photoSelectPage = new PhotoSelectPage(appiumDriver);
        photoSelectPage.select_photoByint(i);
    }

    //判断发送至进度条是否存在
    public boolean isExitprogressbar(){
        return uploadFeedBean.dialog_progressbar.isExists();
    }
    //获取发送中进度条的title
    public String get_progressbarTitle(){
        return uploadFeedBean.dialog_progressbar_title.getText();
    }

}
