package net.oschina.app.com.oschina.pages;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import net.oschina.app.SoloWrap;

/**
 * Created by Administrator on 2016/12/3.
 */

public class PageMyUnLoginStatus {

    private SoloWrap solo;
    private ImageView settingIV,loginIcon;


    public PageMyUnLoginStatus(SoloWrap solo) {
        this.solo = solo;
    }

    public void initView() {
        solo.waitForText("点击头像登录");
        settingIV = (ImageView) solo.getView("net.oschina.app:id/iv_logo_setting");
        loginIcon = (ImageView) solo.getView("net.oschina.app:id/iv_portrait");
    }

    public void clickLoginIcon(){
        solo.clickOnView(loginIcon);
    }

    public void clickSetting(){
        solo.clickOnView(settingIV);
    }




}
