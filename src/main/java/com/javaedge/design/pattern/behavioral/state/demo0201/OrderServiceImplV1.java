package com.javaedge.design.pattern.behavioral.state.demo0201;

import lombok.extern.slf4j.Slf4j;

/**
 * 订单服务
 *
 * @author JavaEdge
 * @date 2022/4/15
 */
@Slf4j
public class OrderServiceImplV1 implements IOrderService {

    @Override
    public boolean pay(OrderInfo orderInfo) {
        boolean result = false;
        switch (orderInfo.getOrderStateEnum()) {
            case UNPAID:
                // biz code
                log.info("支付成功");
                changeState(orderInfo, OrderStateEnum.PAID);
                result = true;
                break;
            default:
                log.info("无法支付");
        }
        return result;
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        boolean result = false;
        switch (orderInfo.getOrderStateEnum()) {
            case PAID:
            case DELIVERED:
                // biz code
                log.info("催单成功");
                result = true;
                break;
            default:
                log.info("无法催单");
        }
        return result;
    }

    @Override
    public boolean delete(OrderInfo orderInfo) {
        boolean result = false;
        switch (orderInfo.getOrderStateEnum()) {
            case UNPAID:
            case DONE:
                // biz code
                log.info("删除成功");
                changeState(orderInfo, OrderStateEnum.DELETED);
                result = true;
                break;
            default:
                log.info("无法删除");
        }
        return result;
    }

    @Override
    public void changeState(OrderInfo orderInfo, OrderStateEnum newState) {
        log.info("订单状态：由{}转变为{}", orderInfo.getOrderStateEnum().getName(), newState.getName());
        orderInfo.setOrderStateEnum(newState);
    }
}
