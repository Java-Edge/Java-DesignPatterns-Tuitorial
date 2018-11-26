package com.sss.design.pattern.creational.factorymethod;

/**
 * @author sss
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
