package net.oschina.app.com.oschina.pages;

import android.widget.ImageView;
import android.widget.TextView;

import net.oschina.app.SoloWrap;

/**
 * Created by Administrator on 2016/12/26.
 */

public class PageNewsDetail {

    private SoloWrap solo;
    private ImageView share;
    private TextView comment;

    public PageNewsDetail(SoloWrap solo){
        this.solo = solo;
    }

    public void initView(){
        share = (ImageView) solo.getView("net.oschina.app:id/iv_share");
        comment = (TextView) solo.getView("net.oschina.app:id/tv_comment_count");
    }

    public void clickShare(){
        solo.clickOnView(share);
    }

    public void clickComment(){
        solo.clickOnView(comment);
    }

}
