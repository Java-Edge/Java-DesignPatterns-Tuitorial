package com.javaedge.design.pattern.structural.adapter;

/**
 * Created by JavaEdge
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();

    }
}
