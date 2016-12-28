package net.oschina.app.com.oschina.pages;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import net.oschina.app.SoloWrap;

/**
 * Created by Administrator on 2016/12/3.
 */

public class PageSettings {

    private SoloWrap solo;
    private TextView logoutTV;


    public PageSettings(SoloWrap solo) {
        this.solo = solo;
    }

    //    用来加载出这个页面要使用到的控件
    public void initView() {
        logoutTV = (TextView) solo.getView("net.oschina.app:id/rl_cancle");
    }

    public void clickLogout(){
        solo.clickOnView(logoutTV);
    }



}
