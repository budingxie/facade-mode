package com.py.facade.logging.test;

import com.py.facade.logging.Log;
import com.py.facade.logging.LogFactory;

/**
 * @author 彭有
 * @date 2020/9/26
 */
public class LogTest {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(LogTest.class.getName());
        log.debug("debug");
        log.info("info");
        log.error("error");
    }
}
