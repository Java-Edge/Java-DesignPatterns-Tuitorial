package com.sss.design.pattern.creational.abstractfactoryadd;

import com.sss.design.pattern.creational.factory.Human;
import com.sss.design.pattern.creational.factory.YellowHuman;

/**
 * @author sss
 * @date 2018/11/1
 */
public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
