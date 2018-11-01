package com.javaedge.design.pattern.behavioral.strategy;

/**
 * 测试类
 *
 * @author JavaEdge
 * @date 2019/1/16
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new MinusPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new CashBackPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();

    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//
//        String promotionKey = "LIJIAN";
//
//        if (StringUtils.equals(promotionKey, "LIJIAN")) {
//            promotionActivity = new PromotionActivity(new MinusPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey, "FANXIAN")) {
//            promotionActivity = new PromotionActivity(new CashBackPromotionStrategy());
//        }//...
//
//        promotionActivity.executePromotionStrategy();
//
//    }

//    public static void main(String[] args) {
//        String promotionKey = "LIJIAN";
//        PromotionActivity promotionActivity = new PromotionActivity(
//                PromotionStrategyFactory.getPromotionStrategy(promotionKey));
//
//        promotionActivity.executePromotionStrategy();
//    }
}


