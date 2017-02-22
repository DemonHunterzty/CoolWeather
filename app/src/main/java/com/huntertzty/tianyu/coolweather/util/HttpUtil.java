package com.huntertzty.tianyu.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Tianyu on 2/21/2017.
 */

//定义和服务器的交互，使用OkHttp工具
    //我们发起一条HTTP请求只需要调用sendOkHttpRequest方法，传入请求地址，并注册一个回调来处理服务器响应就可以了
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
