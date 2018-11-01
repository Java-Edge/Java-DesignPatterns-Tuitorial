package com.javaedge.design.pattern.creational.abstractfactoryadd;

/**
 * @author JavaEdge
 * @date 2018/11/7
 */
public class FemaleBlackHuman extends AbstractYellowHuman {

    /**
     * 黄人女性
     */
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
