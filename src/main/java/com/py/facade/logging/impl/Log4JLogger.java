package com.py.facade.logging.impl;

import com.py.facade.logging.Log;

/**
 * @author 彭有
 * @date 2020/9/26
 */
public class Log4JLogger implements Log {

    /**
     * 构造一个对象
     * debug:1
     * info:2
     * error:3
     */
    private Integer level;

    protected void log(Integer level, String msg, Throwable ex) {
        // 1.判断日志级别
        // 2.打印日志
        // 一些自定义的操作
    }

    public Log4JLogger(Integer level) {
        this.level = level;
    }

    public void debug(Object msg) {
        log(level, String.valueOf(msg), null);
    }

    public void info(Object msg) {
        log(level, String.valueOf(msg), null);
    }

    public void error(Object msg) {
        log(level, String.valueOf(msg), null);
    }
}
