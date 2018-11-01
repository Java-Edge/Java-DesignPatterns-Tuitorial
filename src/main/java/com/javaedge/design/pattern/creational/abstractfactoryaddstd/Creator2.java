package com.javaedge.design.pattern.creational.abstractfactoryaddstd;

/**
 * @author JavaEdge
 * @date 2018/11/8
 */
public class Creator2 extends AbstractCreator {
    /**
     * 只生产产品等级为2的A产品
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    /**
     * 只生产产品等级为2的B产品
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}