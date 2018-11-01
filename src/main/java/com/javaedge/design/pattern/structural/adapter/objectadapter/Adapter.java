package com.javaedge.design.pattern.structural.adapter.objectadapter;

/**
 * Created by Learner
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
