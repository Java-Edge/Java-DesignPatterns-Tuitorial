package com.javaedge.design.pattern.creational.factorymethod;

/**
 * Created by JavaEdge
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FeVideo();
    }
}
