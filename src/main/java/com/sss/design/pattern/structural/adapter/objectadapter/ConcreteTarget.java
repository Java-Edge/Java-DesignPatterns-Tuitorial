package com.sss.design.pattern.structural.adapter.objectadapter;


/**
 * Created by geely
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
