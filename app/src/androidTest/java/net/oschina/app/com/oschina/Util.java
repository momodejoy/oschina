package net.oschina.app.com.oschina;

import junit.framework.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/12/26.
 */

public class Util {

    public static void sendHttpRequest(String className,String methodName){

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60,TimeUnit.SECONDS)
                .readTimeout(60,TimeUnit.SECONDS)
                .build();
//        访问服务器的地址
        HttpUrl.Builder urlBuilder = HttpUrl.parse("https://169.254.224.15:8080/Ser/Server").newBuilder();
        urlBuilder.addQueryParameter("className", className);
        urlBuilder.addQueryParameter("methodName", methodName);
//        将参数添加到url中
        String url = urlBuilder.build().toString();
//        客户端发送请求
        Request request = new Request.Builder().url(url).build();
//        服务端响应请求
        try {
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail("Cross app cannot be completed");
        }

    }

}
