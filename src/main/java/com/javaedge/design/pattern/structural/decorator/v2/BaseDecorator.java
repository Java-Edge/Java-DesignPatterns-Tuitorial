package com.javaedge.design.pattern.structural.decorator.v2;

/**
 * @author JavaEdge
 */
public abstract class BaseDecorator implements BaseBatterCake {

    private BaseBatterCake baseBattercake;

    public BaseDecorator(BaseBatterCake baseBattercake) {
        this.baseBattercake = baseBattercake;
    }

    /**
     *
     */
    protected abstract void doSomething();

    @Override
    public String getDesc() {
        return this.baseBattercake.getDesc();
    }

    @Override
    public int cost() {
        return this.baseBattercake.cost();
    }
}
