package com.py.facade.logging;

/**
 * @author 彭有
 * @date 2020/9/26
 */
public interface Log {

    void debug(Object msg);

    void info(Object msg);

    void error(Object msg);

}
