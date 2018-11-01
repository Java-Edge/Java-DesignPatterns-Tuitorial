package com.javaedge.design.pattern.structural.decorator.v1;

/**
 * 通过继承扩展类的功能
 *
 * @author JavaEdge
 */
public class Test {
    public static void main(String[] args) {
        BatterCake battercake = new BatterCake();
        System.out.println(battercake.getDesc() + " 销售价格:" + battercake.cost());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + " 销售价格:" + batterCakeWithEgg.cost());


        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + " 销售价格:" + batterCakeWithEggSausage.cost());


    }
}
