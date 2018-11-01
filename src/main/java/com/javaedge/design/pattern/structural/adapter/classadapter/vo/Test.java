package com.javaedge.design.pattern.structural.adapter.classadapter.vo;

/**
 * @author JavaEdge
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
