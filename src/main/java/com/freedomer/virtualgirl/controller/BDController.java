package com.freedomer.virtualgirl.controller;

import com.freedomer.virtualgirl.bean.gson.BDTokenResp;
import com.freedomer.virtualgirl.manager.TokenManager;
import com.freedomer.virtualgirl.service.BDService;
import com.freedomer.virtualgirl.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @atuhor:eavawu
 * @date:15/08/2017
 * @todo:bd的所有逻辑接口
 */
@RestController
@RequestMapping("bd")
public class BDController {
    @Autowired
    BDService bdService;
    @ResponseBody
    @RequestMapping(value = "getToken", method = RequestMethod.GET)
    public BDTokenResp getToken(){
        LogUtil.info("getToken=>BDController");
        if (TokenManager.getInstance().getBdToken()==null){
            TokenManager.getInstance().setBdToken(bdService.getToken());
        }
        return TokenManager.getInstance().getBdToken();
    }

}
