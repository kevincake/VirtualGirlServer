package com.freedomer.virtualgirl.http;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @atuhor:eavawu
 * @date:15/08/2017
 * @todo:
 */
public class HttpFactory {
    private static HttpFactory httpFactory = new HttpFactory();
    private Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).baseUrl("http://www.baidu.com").build();

    public static HttpFactory getDefault() {
        return httpFactory;
    }

    public BDNet getBDNet(){
       return retrofit.create(BDNet.class);
    }


}
