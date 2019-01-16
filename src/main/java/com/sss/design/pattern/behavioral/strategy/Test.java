package com.sss.design.pattern.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * 测试类
 *
 * @author sss
 * @date 2019/1/16
 */
public class Test {

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//
//    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//
//        String promotionKey = "LIJIAN";
//
//        if (StringUtils.equals(promotionKey, "LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey, "FANXIAN")) {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }//...
//
//        promotionActivity.executePromotionStrategy();
//
//    }

    public static void main(String[] args) {
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(
                PromotionStrategyFactory.getPromotionStrategy(promotionKey));

        promotionActivity.executePromotionStrategy();
    }
}


