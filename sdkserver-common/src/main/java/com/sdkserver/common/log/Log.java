package com.sdkserver.common.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @Author Eric Chan
 * @Description  日志类
 * @Date 2018/9/15 16:03
 * @CLASS Log
 */
public class Log {


    static{
        PropertyConfigurator.configure("sdkserver-common/src/main/resources/log4j.properties");
    }

    private static Logger logger = Logger.getLogger(Log.class.getName());

    public static void i(String msg){
        logger.info(msg);
    }

    public static void d(String msg){ logger.info(msg); }

    public static void d(String msg, Object...params){
        msg = String.format(msg, params);
        logger.info(msg);
    }

    public static void e(String msg){
        logger.error(msg);
    }

    public static void e(String msg, Object...params){
        msg = String.format(msg, params);
        logger.error(msg);
    }

    public static void e(String msg, Throwable throwable){
        logger.error(msg, throwable);
    }
}
