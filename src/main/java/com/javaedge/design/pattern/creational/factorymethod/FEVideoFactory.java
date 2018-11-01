package com.javaedge.design.pattern.creational.factorymethod;

/**
 * @author JavaEdge
 */
public class FEVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new FeVideo();
    }
}
