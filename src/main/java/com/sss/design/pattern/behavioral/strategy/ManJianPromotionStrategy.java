package com.sss.design.pattern.behavioral.strategy;

/**
 * 满减策略
 *
 * @author sss
 * @date 2019/1/16
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200减20元");
    }
}
