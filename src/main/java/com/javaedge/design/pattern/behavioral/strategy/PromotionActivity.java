package com.javaedge.design.pattern.behavioral.strategy;

/**
 * 促销活动
 *
 * @author JavaEdge
 * @date 2019/1/16
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    /**
     * 构造器注入
     *
     * @param promotionStrategy
     */
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
