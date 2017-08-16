package com.freedomer.virtualgirl.manager;

import com.freedomer.virtualgirl.bean.gson.BDTokenResp;

/**
 * @atuhor:eavawu
 * @date:15/08/2017
 * @todo:管理网站所有的token
 */
public class TokenManager {
    private BDTokenResp bdToken;
    private static TokenManager tokenManager = new TokenManager();

    public static TokenManager getInstance() {
        return tokenManager;
    }


    public BDTokenResp getBdToken() {
        return bdToken;
    }

    public void setBdToken(BDTokenResp bdToken) {
        this.bdToken = bdToken;
    }
}
