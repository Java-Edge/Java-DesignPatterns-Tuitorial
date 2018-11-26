package com.sss.design.pattern.creational.abstractfactoryadd;

/**
 * @author sss
 * @date 2018/11/7
 */
public class FemaleFactory implements HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
