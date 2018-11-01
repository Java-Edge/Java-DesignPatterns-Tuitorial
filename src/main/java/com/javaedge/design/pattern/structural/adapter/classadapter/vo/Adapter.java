package com.javaedge.design.pattern.structural.adapter.classadapter.vo;

/**
 * @author JavaEdge
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
