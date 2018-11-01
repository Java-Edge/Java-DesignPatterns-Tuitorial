package com.javaedge.design.pattern.creational.factorymethod;

/**
 * @author JavaEdge
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
