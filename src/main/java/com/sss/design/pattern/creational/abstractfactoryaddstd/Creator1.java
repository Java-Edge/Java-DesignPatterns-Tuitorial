package com.sss.design.pattern.creational.abstractfactoryaddstd;

/**
 * @author sss
 * @date 2018/11/8
 */
public class Creator1 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
