package com.javaedge.design.pattern.structural.adapter.classadapter;

/**
 * Created by geely
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
