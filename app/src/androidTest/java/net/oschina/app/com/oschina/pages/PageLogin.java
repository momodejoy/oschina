package net.oschina.app.com.oschina.pages;

import android.widget.Button;
import android.widget.EditText;

import net.oschina.app.R;
import net.oschina.app.SoloWrap;

/**
 * Created by Administrator on 2016/12/3.
 */

public class PageLogin {

    private SoloWrap solo;
    private EditText nameET, pwdET;
    private Button loginBtn;

    public PageLogin(SoloWrap solo) {
        this.solo = solo;
    }

    //    用来加载出这个页面要使用到的控件
    public void initView() {
//        name = (EditText) solo.getView(R.id.et_username);
//        pwd = (EditText) solo.getView(R.id.et_password);
        nameET = (EditText) solo.getView("net.oschina.app:id/et_username");
        pwdET = (EditText) solo.getView("net.oschina.app:id/et_password");
        loginBtn = (Button) solo.getView("net.oschina.app:id/btn_login");
    }

//    页面用到的方法
    public void enterName(String name){
        solo.enterText(nameET,name);
    }

    public void enterPwd(String pwd){
        solo.enterText(pwdET,pwd);
    }

    public void clearName(){
        solo.clearEditText(nameET);
    }

    public void clearPwd(){
        solo.clearEditText(pwdET);
    }

    public void clickLoginBtn(){
        solo.clickOnView(loginBtn);
    }

    public void login(String name,String pwd){
        clearName();
        enterName(name);
        clearPwd();
        enterPwd(pwd);
        clickLoginBtn();
    }


}
