package com.javaedge.design.pattern.structural.decorator.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author JavaEdge
 */
@Slf4j
public class SausageDecorator extends BaseDecorator {

    public SausageDecorator(BaseBatterCake baseBattercake) {
        super(baseBattercake);
    }

    @Override
    protected void doSomething() {
        log.info("SausageDecorator");
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
