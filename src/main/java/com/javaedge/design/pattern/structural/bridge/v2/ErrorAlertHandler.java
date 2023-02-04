package com.javaedge.design.pattern.structural.bridge.v2;

/**
 * 在API监控告警的例子中，我们如下方式来使用Notification类：
 *
 * @author JavaEdge
 * @date 2022/5/23
 */
//public class ErrorAlertHandler extends AlertHandler {
////    public ErrorAlertHandler(AlertRule rule, Notification notification) {
////        super(rule, notification);
////    }
////
////    @Override
////    public void check(ApiStatInfo apiStatInfo) {
////        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
////            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
////        }
////    }
////}
