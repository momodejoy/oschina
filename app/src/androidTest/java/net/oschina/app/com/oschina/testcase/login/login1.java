package net.oschina.app.com.oschina.testcase.login;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

import net.oschina.app.AppStart;
import net.oschina.app.BasicTestCase;

/**
 * Created by Administrator on 2016/12/2.
 */

public class login1 extends BasicTestCase {

       public login1() {
              super(false);
       }

       public void testLogin1() {
//              assertFalse(true);
              pageHelper.getpageNavigation().clickMeTab();
              pageHelper.getPageMyUnLoginStatus().clickLoginIcon();
              pageHelper.getPageLogin().login("2277144876@qq.com","yan1992sss");
              assertTrue(pageHelper.getpageCommon().searchText("用户名或口令错"));
       }

}
