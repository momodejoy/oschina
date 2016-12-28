package net.oschina.app.com.oschina;

import net.oschina.app.SoloWrap;
import net.oschina.app.com.oschina.pages.PageCommon;
import net.oschina.app.com.oschina.pages.PageLogin;
import net.oschina.app.com.oschina.pages.PageMyLoginStatus;
import net.oschina.app.com.oschina.pages.PageMyUnLoginStatus;
import net.oschina.app.com.oschina.pages.PageNavigation;
import net.oschina.app.com.oschina.pages.PageNewsDetail;
import net.oschina.app.com.oschina.pages.PageSettings;

/**
 * Created by Administrator on 2016/12/3.
 *
 * 用来管理page类
 *
 */

public class PageHelper {
    private SoloWrap solo;
    private PageLogin pageLogin;
    private PageMyUnLoginStatus pageMyUnLoginStatus;
    private PageSettings pageSettings;
    private PageMyLoginStatus pageMyLoginStatus;
    private PageNavigation pageNavigation;
    private PageCommon pageCommon;
    private PageNewsDetail pageNewsDetail;



    public PageHelper(SoloWrap solo){
        this.solo = solo;
    }

    public PageLogin getPageLogin(){
        if (pageLogin == null){
            pageLogin = new PageLogin(solo);
        }
        pageLogin.initView();
        return pageLogin;
    }

    public PageMyUnLoginStatus getPageMyUnLoginStatus(){
        if (pageMyUnLoginStatus == null){
            pageMyUnLoginStatus = new PageMyUnLoginStatus(solo);
        }
        pageMyUnLoginStatus.initView();
        return pageMyUnLoginStatus;
    }

    public PageSettings getPageSettings(){
        if (pageSettings == null){
            pageSettings = new PageSettings(solo);
        }
        pageSettings.initView();
        return pageSettings;
    }
    public PageMyLoginStatus getpageMyLoginStatus(){
        if (pageMyLoginStatus == null){
            pageMyLoginStatus = new PageMyLoginStatus(solo);
        }
        pageMyLoginStatus.initView();
        return pageMyLoginStatus;
    }

    public PageNavigation getpageNavigation(){
        if (pageNavigation == null){
            pageNavigation = new PageNavigation(solo);
        }
        pageNavigation.initView();
        return pageNavigation;
    }

    public PageCommon getpageCommon(){
        if (pageCommon == null){
            pageCommon = new PageCommon(solo);
        }
        return pageCommon;
    }

    public PageNewsDetail pageNewsDetail(){
        if (pageNewsDetail == null){
            pageNewsDetail = new PageNewsDetail(solo);
        }
        pageNewsDetail.initView();
        return pageNewsDetail;
    }


}
