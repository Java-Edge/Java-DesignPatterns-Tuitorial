package com.javaedge.design.pattern.creational.factorymethod;

/**
 * Created by JavaEdge
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
