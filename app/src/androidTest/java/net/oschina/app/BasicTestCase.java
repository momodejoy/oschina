package net.oschina.app;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

import net.oschina.app.com.oschina.PageHelper;

import static com.loopj.android.http.AsyncHttpClient.log;

/**
 * Created by Administrator on 2016/12/2.
 */

public class BasicTestCase extends ActivityInstrumentationTestCase2<AppStart> {

    private boolean isNeedLogin=false;

    private Solo solo1;
    private SoloWrap solo;
    protected PageHelper pageHelper;


    public BasicTestCase(boolean isNeedLogin){
        super(AppStart.class);
        this.isNeedLogin=isNeedLogin;
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo1 = new Solo(getInstrumentation(),getActivity());
        solo = new SoloWrap(solo1);
        try {
            pageHelper = new PageHelper(solo);
            solo.clickOnText("我的");
            if(isNeedLogin ){
                if (!pageHelper.getpageMyLoginStatus().isAlreadyLogin()){
                    pageHelper.getPageMyUnLoginStatus().clickLoginIcon();
                    pageHelper.getPageLogin().login("2277144876@qqc.com","yan1992");
                }

            }else {
                if (pageHelper.getpageMyLoginStatus().isAlreadyLogin()){
                    pageHelper.getpageMyLoginStatus().clickSettings();
                    pageHelper.getPageSettings().clickLogout();

                }
            }
            pageHelper.getpageNavigation().clickNewsTab();
        }catch (Exception ex){
            log.i("AUTO","Exception happende in setUp section,error msg is"+ex.getMessage());
            solo.takeScreenShot(this.getClass().getSimpleName());
            throw ex;
        }
    }

//    为了让程序在执行脚本的时候出现错误，截图，所以要重写runTest
    @Override
    protected void runTest() throws Throwable {
        try {
            super.runTest();
        }catch (Throwable ex){
//            测试方法中有junit的断言，断言用Exception是捕捉不到的，所以最好是用Throwable来做
            log.i("AUTO","Exception happende in runTest section,error msg is"+ex.getMessage());
            solo.takeScreenShot(this.getClass().getSimpleName());
            throw ex;
        }

    }

    @Override
    public void tearDown() throws Exception {
        try {

        }catch (Throwable ex){
            log.i("AUTO","Exception happende in tearDown section,error msg is"+ex.getMessage());
            solo.takeScreenShot(this.getClass().getSimpleName());
            throw ex;
        }finally {
            solo.finishOpenedActivities();
            super.tearDown();
        }

    }

}
