package com.javaedge.design.pattern.creational.abstractfactoryadd.base;

/**
 * @author JavaEdge
 * @date 2018/11/1
 */
public class ConcreteCreator<T> extends Creator<T> {

    @Override
    public T createProduct(Class c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}
