package com.sss.design.pattern.creational.abstractfactoryaddstd;

/**
 * @author sss
 * @date 2018/11/8
 */
public abstract class AbstractProductA {

    /**
     * 每个产品共有的方法
     */
    public void shareMethod(){
    }

    /**
     * 每个产品相同方法，不同实现
     */
    public abstract void doSomething();
}
