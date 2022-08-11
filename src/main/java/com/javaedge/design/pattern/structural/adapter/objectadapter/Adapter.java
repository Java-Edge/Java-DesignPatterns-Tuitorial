package com.javaedge.design.pattern.structural.adapter.objectadapter;

/**
 * Created by JavaEdge
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
