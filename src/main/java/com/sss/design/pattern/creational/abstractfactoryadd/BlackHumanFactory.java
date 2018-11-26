package com.sss.design.pattern.creational.abstractfactoryadd;

import com.sss.design.pattern.creational.factory.BlackHuman;
import com.sss.design.pattern.creational.factory.Human;

/**
 * @author sss
 * @date 2018/11/1
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
