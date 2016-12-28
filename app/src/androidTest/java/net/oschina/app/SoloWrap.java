package net.oschina.app;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.robotium.solo.WebElement;

import junit.framework.AssertionFailedError;

import static com.loopj.android.http.AsyncHttpClient.log;

/**
 * Created by Administrator on 2016/12/3.
 */

public class SoloWrap {

    private Solo solo;

    public SoloWrap(Solo solo){
        this.solo = solo;
    }

    public void clickOnText(String text){
        Log.i("Auto","我要点击文本"+text);
        solo.clickOnText(text);
    }

    public View getView(String id){
        try {
            return solo.getView(id);
        }catch (AssertionFailedError afe){
            return null;
        }
    }

    public View getView(int id){
        try {
            return solo.getView(id);
        }catch (AssertionFailedError afe){
            return null;
        }
    }

    public void enterText(EditText et,String text){
        log.i("AUTO","我要往输入框："+et+"输入文本"+text);
        solo.enterText(et,text);
    }

    public void clearEditText(EditText et){
        solo.clearEditText(et);
    }

    public void clickOnView(View view){
        Log.i("AUTO","我要点击控件"+view);
        solo.clickOnView(view);
    }

    public void finishOpenedActivities(){
        solo.finishOpenedActivities();
    }

    public boolean searchText(String text){
        return solo.searchText(text,true);
    }

    public boolean waitForText(String text){
        return solo.waitForText(text,1,5000,false,true);
    }

    public void takeScreenShot(String name){
        solo.takeScreenshot(name);
    }

    public void sleep(int time){
        solo.sleep(time);
    }

    public WebElement getWebElement(String xpath){
        WebElement webele = solo.getWebElement(By.xpath(xpath),0);
        return webele;
    }

}
