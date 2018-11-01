package com.javaedge.design.pattern.creational.abstractfactoryadd;

import com.javaedge.design.pattern.creational.factory.Human;

/**
 * @author JavaEdge
 * @date 2018/11/1
 */
public abstract class AbstractHumanFactory {

    /**
     * 创造人类
     *
     * @return
     */
    public abstract Human createHuman();
}
