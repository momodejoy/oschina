package net.oschina.app.com.oschina.pages;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import net.oschina.app.SoloWrap;

/**
 * Created by Administrator on 2016/12/3.
 */

public class PageMyLoginStatus {

    private SoloWrap solo;
    private ImageView settings;
    private TextView nickTV;


    public PageMyLoginStatus(SoloWrap solo) {
        this.solo = solo;
    }

    //    用来加载出这个页面要使用到的控件
    public void initView() {
        solo.waitForText("wuyy1992");
        settings = (ImageView) solo.getView("net.oschina.app:id/iv_logo_setting");
        nickTV = (TextView) solo.getView("net.oschina.app:id/tv_nick");
    }

    public void clickSettings(){
        solo.clickOnView(settings);
    }

    public String getNickName(){
        return nickTV.getText().toString();
    }

    public boolean isAlreadyLogin(){
        return getNickName().equals("wuyy1992");
    }
}
