package com.javaedge.design.pattern.creational.abstractfactoryadd;

import com.javaedge.design.pattern.creational.abstractfactoryadd.base.ConcreteCreator;
import com.javaedge.design.pattern.creational.abstractfactoryadd.base.ConcreteProduct1;
import com.javaedge.design.pattern.creational.abstractfactoryadd.base.Creator;
import com.javaedge.design.pattern.creational.abstractfactoryadd.base.Product;

/**
 * @author JavaEdge
 * @date 2018/11/1
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = (Product) creator.createProduct(ConcreteProduct1.class);
        /*
         * 继续业务处理
         */
    }
}
