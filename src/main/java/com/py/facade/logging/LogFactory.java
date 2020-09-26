package com.py.facade.logging;

import com.py.facade.logging.impl.Jdk14Logger;
import com.py.facade.logging.impl.Log4JLogger;

import java.util.Hashtable;

/**
 * @author 彭有
 * @date 2020/9/26
 */
public abstract class LogFactory {

    private static Hashtable<String, Log> hashtable = new Hashtable<String, Log>();

    static {
        hashtable.put("jul", new Jdk14Logger(1));
        hashtable.put("log4j", new Log4JLogger(1));
    }


    private LogFactory() {

    }

    public static Log getLog(String name) {
        Log log = hashtable.get(name);
        return log;
    }

    public static Log getInstance() {
        return null;
    }

    /**
     * 1.添加到hashtable
     * 2.返回
     *
     * @param clazz
     * @return
     */
    public abstract Log getInstance(Class clazz);

    public static LogFactory getFactory() {
        // 加载
        return null;
    }
}

