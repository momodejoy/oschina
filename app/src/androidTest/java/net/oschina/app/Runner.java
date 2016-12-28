package net.oschina.app;

import android.test.InstrumentationTestRunner;

import com.zutubi.android.junitreport.JUnitReportTestRunner;

import junit.framework.TestSuite;

import net.oschina.app.com.oschina.testsuits.SuitLogin;
import net.oschina.app.com.oschina.testsuits.SuitNews;

/**
 * Created by Administrator on 2016/12/3.
 */

public class Runner extends JUnitReportTestRunner {


    @Override
    public TestSuite getAllTests() {
        TestSuite suite = new TestSuite();
        suite.addTest(SuitLogin.getLoginSuit());
//        suite.addTest(SuitNews.getNewsSuit());
        return suite;
    }
}
