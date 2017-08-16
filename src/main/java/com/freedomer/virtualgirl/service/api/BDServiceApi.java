package com.freedomer.virtualgirl.service.api;

import com.freedomer.virtualgirl.bean.gson.BDTokenResp;
import org.springframework.stereotype.Service;

/**
 * @atuhor:eavawu
 * @date:15/08/2017
 * @todo:
 */

public interface BDServiceApi {
     BDTokenResp getToken();
}
