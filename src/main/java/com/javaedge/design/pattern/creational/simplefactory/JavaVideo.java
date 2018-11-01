package com.javaedge.design.pattern.creational.simplefactory;

/**
 * @author JavaEdge
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
