package com.javaedge.design.pattern.creational.factorymethod;

/**
 * Created by JavaEdge
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
