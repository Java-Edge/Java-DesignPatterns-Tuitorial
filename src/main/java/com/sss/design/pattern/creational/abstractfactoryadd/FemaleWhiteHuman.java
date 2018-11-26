package com.sss.design.pattern.creational.abstractfactoryadd;

/**
 * @author sss
 * @date 2018/11/7
 */
public class FemaleWhiteHuman extends AbstractYellowHuman {

    /**
     * 黄人女性
     */
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
