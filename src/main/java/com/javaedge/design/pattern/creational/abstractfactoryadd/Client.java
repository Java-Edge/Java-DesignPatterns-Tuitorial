package com.javaedge.design.pattern.creational.abstractfactoryadd;

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
