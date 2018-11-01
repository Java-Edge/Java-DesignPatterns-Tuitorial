package com.javaedge.design.pattern.creational.abstractfactoryadd;

import com.javaedge.design.pattern.creational.factory.Human;
import com.javaedge.design.pattern.creational.factory.WhiteHuman;

/**
 * @author JavaEdge
 * @date 2018/11/1
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
