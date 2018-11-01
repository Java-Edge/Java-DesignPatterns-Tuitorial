package com.javaedge.design.pattern.creational.simplefactory;

/**
 * @author JavaEdge
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("生产Java课程视频");
    }
}
