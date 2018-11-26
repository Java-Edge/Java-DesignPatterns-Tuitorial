package com.sss.design.pattern.creational.factorymethod;

/**
 * @author sss
 */
public class FeVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
