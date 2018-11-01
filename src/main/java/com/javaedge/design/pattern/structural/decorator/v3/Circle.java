package com.javaedge.design.pattern.structural.decorator.v3;

/**
 * @author JavaEdge
 * @date 2021/5/31
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
