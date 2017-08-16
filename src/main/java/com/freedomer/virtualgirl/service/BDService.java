package com.freedomer.virtualgirl.service;

import com.freedomer.virtualgirl.bean.gson.BDTokenResp;
import com.freedomer.virtualgirl.http.HttpFactory;
import com.freedomer.virtualgirl.service.api.BDServiceApi;
import com.freedomer.virtualgirl.util.LogUtil;
import org.springframework.stereotype.Service;

/**
 * @atuhor:eavawu
 * @date:15/08/2017
 * @todo:bd服务
 */
@Service
public class BDService implements BDServiceApi {
    @Override
    public BDTokenResp getToken() {
        BDTokenResp bdTokenResp = HttpFactory.getDefault().getBDNet().getToken().blockingLast();
        LogUtil.info("getToken=>"+bdTokenResp.toString());
        return bdTokenResp;
    }
}
