package com.sss.design.pattern.creational.abstractfactoryadd;

/**
 * @author sss
 * @date 2018/11/7
 */
public class MaleBlackHuman extends AbstractYellowHuman {

    /**
     * 黄人男性
     */
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
