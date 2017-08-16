package com.freedomer.virtualgirl.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by eavawu on 4/28/16.
 */

public class LogUtil {
    private static boolean isShowLog = true;
    private final static Logger logger = LoggerFactory.getLogger(LogUtil.class);
    public static void info(String info){
        if (isShowLog){
            logger.info(info);
        }
    }
    public static void error(String errinfo){
        if (isShowLog){
            logger.error(errinfo);
        }
    }
}

