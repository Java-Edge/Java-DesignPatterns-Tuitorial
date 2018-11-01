package com.javaedge.design.pattern.creational.abstractfactoryaddstd;

/**
 * @author JavaEdge
 * @date 2018/11/8
 */
public abstract class AbstractCreator {
    /**
     * 创建A产品家族
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     * @return
     */
    public abstract AbstractProductB createProductB();
}
