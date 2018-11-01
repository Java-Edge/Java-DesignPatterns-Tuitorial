package com.javaedge.design.pattern.behavioral.state.demo0201;

/**
 * 订单服务接口
 *
 * @author JavaEdge
 */
public interface IOrderService {

    boolean pay(OrderInfo orderInfo);

    /**
     * 催单
     */
    boolean reminder(OrderInfo orderInfo);

    /**
     * 删除订单
     */
    boolean delete(OrderInfo orderInfo);

    /**
     * 修改订单状态
     */
    void changeState(OrderInfo orderInfo, OrderStateEnum newState);
}
