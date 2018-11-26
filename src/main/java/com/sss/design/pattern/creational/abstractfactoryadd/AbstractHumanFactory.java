package com.sss.design.pattern.creational.abstractfactoryadd;

import com.sss.design.pattern.creational.factory.Human;

/**
 * @author sss
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
