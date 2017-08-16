package com.freedomer.virtualgirl.schedule;

import com.freedomer.virtualgirl.manager.TokenManager;
import com.freedomer.virtualgirl.service.api.BDServiceApi;
import com.freedomer.virtualgirl.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @atuhor:eavawu
 * @date:15/08/2017
 * @todo:定时器
 */
@Component
public class BDSchedule {
    @Autowired
    private AsyncWorker worker;
    @Autowired
    BDServiceApi bdServiceApi;

    //bd的token刷新
    @Scheduled(fixedRate = 2592000/2)
    public void refreshToken() {
        worker.work(new Runnable() {
            @Override
            public void run() {
                LogUtil.info("refreshToken");
//                TokenManager.getInstance().setBdToken(bdServiceApi.getToken());
            }
        });
    }

}
