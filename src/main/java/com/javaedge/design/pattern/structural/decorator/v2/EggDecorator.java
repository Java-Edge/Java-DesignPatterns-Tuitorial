package com.javaedge.design.pattern.structural.decorator.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author JavaEdge
 */
@Slf4j
public class EggDecorator extends BaseDecorator {

    public EggDecorator(BaseBatterCake baseBattercake) {
        super(baseBattercake);
    }

    @Override
    protected void doSomething() {
        log.info("EggDecorator");
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
