package com.sss.design.pattern.creational.abstractfactoryadd;

import com.sss.design.pattern.creational.factory.Human;
import com.sss.design.pattern.creational.factory.WhiteHuman;

/**
 * @author sss
 * @date 2018/11/1
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
