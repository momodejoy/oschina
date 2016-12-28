package net.oschina.app.com.oschina.testsuits;

import junit.framework.TestSuite;

import net.oschina.app.com.oschina.testcase.login.login1;
import net.oschina.app.com.oschina.testcase.login.login2;

/**
 * Created by Administrator on 2016/12/3.
 */

public class SuitLogin {

    public static TestSuite getLoginSuit(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(login1.class);
//        suite.addTestSuite(login2.class);
        return suite;
    }
}
