package com.py.facade.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;

/**
 * @author 彭有
 * @date 2020/9/26
 */
public abstract class LogFactory {

    private static Hashtable<String, String> hashtable = new Hashtable<String, String>();

    static {
        hashtable.put("jul", "com.py.facade.logging.impl.Jdk14Logger");
        hashtable.put("log4j", "com.py.facade.logging.impl.Log4JLogger");
    }


    private LogFactory() {

    }

    public static Log getLog(String name) {
        // 1.获取加载的日志对象
        // 2.创建日志对象

        Log log = null;
        for (String value : hashtable.values()) {
            try {
                Class<?> logClazz = Class.forName(value);
                Constructor<?> constructor = logClazz.getConstructor(Integer.class, String.class);
                log = (Log) constructor.newInstance(1, name);
            } catch (Exception e) {
                // 没有对应的日志
            }
        }
        if (log == null) {
            throw new RuntimeException();
        }
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

