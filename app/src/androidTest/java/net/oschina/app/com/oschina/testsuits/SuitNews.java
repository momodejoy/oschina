package net.oschina.app.com.oschina.testsuits;

import junit.framework.TestSuite;

import net.oschina.app.com.oschina.testcase.login.login1;
import net.oschina.app.com.oschina.testcase.login.login2;
import net.oschina.app.com.oschina.testcase.news.news;

/**
 * Created by Administrator on 2016/12/3.
 */

public class SuitNews {

    public static TestSuite getNewsSuit(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(news.class);
        return suite;
    }
}
