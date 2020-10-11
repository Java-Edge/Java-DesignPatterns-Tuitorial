package com.javaedge.design.pattern.behavioral.strategy;

/**
 * 返现策略
 *
 * @author JavaEdge
 * @date 2019/1/16
 */
public class FanXianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额放到公众号 JavaEdge 用户的余额中");
    }
}
