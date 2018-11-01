package com.sss.design.pattern.creational.factorymethod;

/**
 * Created by geely
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
