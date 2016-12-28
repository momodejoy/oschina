package net.oschina.app.com.oschina.pages;

import net.oschina.app.SoloWrap;

/**
 * Created by Administrator on 2016/12/3.
 */

public class PageCommon {

    private SoloWrap solo;

    public PageCommon(SoloWrap solo){
        this.solo = solo;
    }

    public boolean searchText(String text){
        return solo.searchText(text);
    }

    public void clickOnText(String text){
        solo.clickOnText(text);
    }

    public void sleep(int time){
        solo.sleep(time);
    }

}
