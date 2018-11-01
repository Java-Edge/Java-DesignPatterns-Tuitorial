package com.javaedge.design.pattern.structural.adapter.classadapter;

/**
 * Created by JavaEdge
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
