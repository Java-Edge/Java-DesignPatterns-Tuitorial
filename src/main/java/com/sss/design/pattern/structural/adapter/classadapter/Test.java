package com.sss.design.pattern.structural.adapter.classadapter;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();



    }
}
