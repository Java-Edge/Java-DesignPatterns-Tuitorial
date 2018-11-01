package com.sss.design.pattern.creational.abstractfactory;

/**
 * Created by geely
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
