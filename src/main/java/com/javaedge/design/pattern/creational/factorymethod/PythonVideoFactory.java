package com.javaedge.design.pattern.creational.factorymethod;

/**
 * @author JavaEdge
 */
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
