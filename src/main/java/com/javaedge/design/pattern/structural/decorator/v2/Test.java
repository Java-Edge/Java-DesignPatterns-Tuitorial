package com.javaedge.design.pattern.structural.decorator.v2;

/**
 * @author JavaEdge
 */
public class Test {

    public static void main(String[] args) {
        BaseBatterCake baseBattercake;
        baseBattercake = new BatterCake();
        baseBattercake = new EggDecorator(baseBattercake);
        baseBattercake = new EggDecorator(baseBattercake);
        baseBattercake = new SausageDecorator(baseBattercake);

        System.out.println(baseBattercake.getDesc() + " 销售价格:" + baseBattercake.cost());

    }
}
