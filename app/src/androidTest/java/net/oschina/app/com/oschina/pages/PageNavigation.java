package net.oschina.app.com.oschina.pages;

import android.widget.FrameLayout;
import android.widget.ImageView;

import net.oschina.app.SoloWrap;

/**
 * Created by Administrator on 2016/12/3.
 */

public class PageNavigation {
    private SoloWrap solo;
    private FrameLayout newsTab,tweetTab,exploreTab,meTab;
    private ImageView PubIM;

    public PageNavigation(SoloWrap solo){
        this.solo = solo;
    }

    public void initView(){
        newsTab = (FrameLayout) solo.getView("net.oschina.app:id/nav_item_news");
        tweetTab = (FrameLayout) solo.getView("net.oschina.app:id/nav_item_tweet");
        exploreTab = (FrameLayout) solo.getView("net.oschina.app:id/nav_item_explore");
        meTab = (FrameLayout) solo.getView("net.oschina.app:id/nav_item_me");
        PubIM = (ImageView) solo.getView("net.oschina.app:id/nav_item_tweet_pub");
    }

    public void clickNewsTab(){
        solo.clickOnView(newsTab);
    }
    public void clickTweetTab(){
        solo.clickOnView(tweetTab);
    }
    public void clickExploreTab(){
        solo.clickOnView(exploreTab);
    }
    public void clickMeTab(){
        solo.clickOnView(meTab);
    }
    public void clickPubIM(){
        solo.clickOnView(PubIM);
    }

}
