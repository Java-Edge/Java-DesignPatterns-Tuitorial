package com.javaedge.design.pattern.creational.factory;

/**
 * @author JavaEdge
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
