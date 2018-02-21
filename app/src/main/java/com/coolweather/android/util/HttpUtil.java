package com.coolweather.android.util;

import android.widget.Toast;

import com.coolweather.android.WeatherActivity;

import java.util.WeakHashMap;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/2/16.
 */

public class HttpUtil {

   static public  void sendOkHttpRequest(String address,okhttp3.Callback callback){

        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
