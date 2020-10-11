package com.javaedge.design.pattern.structural.proxy.dynamicproxy;

import com.javaedge.design.pattern.structural.proxy.IOrderService;
import com.javaedge.design.pattern.structural.proxy.Order;
import com.javaedge.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author JavaEdge
 * @date 2018/9/17 01:06
 */
public class Test {

    public static void main(String[] args) {

        Order order = new Order();
        order.setUserId(2);

        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
