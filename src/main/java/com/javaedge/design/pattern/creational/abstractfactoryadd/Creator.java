package com.javaedge.design.pattern.creational.abstractfactoryadd;

/**
 * @author JavaEdge
 * @date 2018/11/1
 */
public abstract class Creator<T> {

    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     *
     * @param c
     * @return
     */
    public abstract  T createProduct(Class c);
}

