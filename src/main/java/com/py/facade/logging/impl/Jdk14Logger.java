package com.py.facade.logging.impl;

import com.py.facade.logging.Log;


/**
 * @author 彭有
 * @date 2020/9/26
 */
public class Jdk14Logger implements Log {

    /**
     * 构造一个对象
     * debug:1
     * info:2
     * error:3
     */
    private Integer level;

    /**
     * 名称
     */
    private String  name;

    public Jdk14Logger() {
    }

    public Jdk14Logger(Integer level, String name) {
        this.level = level;
        this.name = name;
    }

    protected void log(Integer level, String msg, Throwable ex) {
        // 1.判断日志级别
        // 2.打印日志
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
