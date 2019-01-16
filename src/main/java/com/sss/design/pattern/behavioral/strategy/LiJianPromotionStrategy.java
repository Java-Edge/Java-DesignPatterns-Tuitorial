package com.sss.design.pattern.behavioral.strategy;

/**
 * 立减策略
 *
 * @author sss
 * @date 2019/1/16
 */
public class LiJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("立减促销,资源的价格直接减去配置的价格");
    }
}
