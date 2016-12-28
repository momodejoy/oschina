package net.oschina.app.com.oschina.testcase.news;

import net.oschina.app.BasicTestCase;

/**
 * Created by Administrator on 2016/12/3.
 */

public class news extends BasicTestCase {
    public news() {
        super(false);
    }

    public void testLogin1() {
        pageHelper.getpageNavigation().clickMeTab();
        pageHelper.getPageMyUnLoginStatus().clickLoginIcon();
        pageHelper.getPageLogin().login("2277144876@qq.com","yan1992sss");
        assertTrue(pageHelper.getpageCommon().searchText("用户名或口令错"));
    }

}
