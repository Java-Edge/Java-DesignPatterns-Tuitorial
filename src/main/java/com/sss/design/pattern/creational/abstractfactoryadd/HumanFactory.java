package com.sss.design.pattern.creational.abstractfactoryadd;

/**
 * @author sss
 * @date 2018/11/7
 */
public interface HumanFactory {


    /**
     * 制造一个黄色人种
     * @return
     */
    Human createYellowHuman();

    /**
     * 制造一个白色人种
     * @return
     */
    Human createWhiteHuman();

    /**
     * 制造一个黑色人种
     * @return
     */
    Human createBlackHuman();
}
