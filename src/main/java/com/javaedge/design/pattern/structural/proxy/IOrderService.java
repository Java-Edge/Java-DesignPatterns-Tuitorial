package com.javaedge.design.pattern.structural.proxy;

/**
 * @author JavaEdge
 * @date 2018/9/16 23:19
 */
public interface IOrderService {

    /**
     * 保存订单
     *
     * @param order
     * @return
     */
    int saveOrder(Order order);
}
