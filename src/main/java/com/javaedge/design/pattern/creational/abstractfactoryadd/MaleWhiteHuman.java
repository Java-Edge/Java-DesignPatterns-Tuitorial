package com.javaedge.design.pattern.creational.abstractfactoryadd;

/**
 * @author JavaEdge
 * @date 2018/11/7
 */
public class MaleWhiteHuman extends AbstractYellowHuman {

    /**
     * 黄人男性
     */
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}