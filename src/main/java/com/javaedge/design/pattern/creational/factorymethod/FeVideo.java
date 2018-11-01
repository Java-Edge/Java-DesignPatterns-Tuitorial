package com.javaedge.design.pattern.creational.factorymethod;

/**
 * @author JavaEdge
 */
public class FeVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
