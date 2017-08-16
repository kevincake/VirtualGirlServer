package com.freedomer.virtualgirl.http;

import com.freedomer.virtualgirl.bean.gson.BDTokenResp;
import com.freedomer.virtualgirl.util.LogUtil;
import io.reactivex.subscribers.ResourceSubscriber;
import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * @atuhor:eavawu
 * @date:15/08/2017
 * @todo:
 */
public class BDNetTest {
    @Test
    public void testToken(){
        BDTokenResp bdTokenResp = HttpFactory.getDefault().getBDNet().getToken().blockingLast();
        System.out.println(bdTokenResp.toString());
    }
}
