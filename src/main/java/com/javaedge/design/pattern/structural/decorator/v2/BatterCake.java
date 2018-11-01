package com.javaedge.design.pattern.structural.decorator.v2;

/**
 * @author JavaEdge
 */
public class BatterCake implements BaseBatterCake {

    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
