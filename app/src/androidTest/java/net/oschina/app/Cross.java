package net.oschina.app;

import net.oschina.app.com.oschina.Util;

/**
 * Created by Administrator on 2016/12/26.
 */

public class Cross extends BasicTestCase {

    public Cross(){
        super(false);
    }

    public void testCross(){
        pageHelper.getpageCommon().clickOnText("没能灭掉 Android，CyanogenMod 正式划上休止符");
        pageHelper.getpageCommon().sleep(8);
        pageHelper.pageNewsDetail().clickShare();
        pageHelper.getpageCommon().clickOnText("QQ");
        Util.sendHttpRequest("Cross","testCross");
        pageHelper.pageNewsDetail().clickComment();
        pageHelper.getpageCommon().sleep(8);
    }

}
