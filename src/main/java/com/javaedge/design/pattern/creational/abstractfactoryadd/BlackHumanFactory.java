package com.javaedge.design.pattern.creational.abstractfactoryadd;

import com.javaedge.design.pattern.creational.factory.BlackHuman;
import com.javaedge.design.pattern.creational.factory.Human;

/**
 * @author JavaEdge
 * @date 2018/11/1
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
