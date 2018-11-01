package com.javaedge.design.pattern.behavioral.strategy;

/**
 * 代替 null,防止空指针异常
 * @author JavaEdge
 * @date 2019/1/16
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
