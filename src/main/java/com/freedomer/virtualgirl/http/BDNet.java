package com.freedomer.virtualgirl.http;

import com.freedomer.virtualgirl.bean.gson.BDTokenResp;
import io.reactivex.Flowable;
import retrofit2.http.POST;

/**
 * @atuhor:eavawu
 * @date:15/08/2017
 * @todo:
 */
public interface BDNet {
    @POST("https://openapi.baidu.com/oauth/2.0/token?grant_type=client_credentials&client_id=VGq7gCchaMQHcqWgE2PFgPsa&client_secret=G3xKI5xj5nMmnBSZNIFG3nnyOzaQ72dL")
    Flowable<BDTokenResp> getToken();

}
