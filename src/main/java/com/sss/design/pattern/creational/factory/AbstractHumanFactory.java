package com.sss.design.pattern.creational.factory;

/**
 * @author sss
 * @date 2018/11/1
 */
public abstract class AbstractHumanFactory<T> {

    /**
     * 制造人类
     *
     * @param c Human接口的实现类
     *
     * @return
     */
    public abstract T createHuman(Class c);
}
