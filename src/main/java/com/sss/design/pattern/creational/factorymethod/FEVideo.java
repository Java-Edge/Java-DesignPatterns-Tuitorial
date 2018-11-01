package com.sss.design.pattern.creational.factorymethod;

/**
 * Created by geely
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
