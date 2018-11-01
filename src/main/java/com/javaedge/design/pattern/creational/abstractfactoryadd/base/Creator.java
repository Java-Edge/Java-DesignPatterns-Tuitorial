package com.javaedge.design.pattern.creational.abstractfactoryadd.base;

/**
 * 抽象工厂类，定义产品对象的产生
 *
 * @author JavaEdge
 */
public abstract class Creator<T> {

    /**
     * 创建一个产品对象，入参类型可自行设置
     * 通常为String、Enum、Class，也可为null
     *
     * @param c 类型
     * @return 泛型类型
     */
    public abstract  T createProduct(Class c);
}

