package com.javaedge.design.pattern.structural.proxy.staticproxy;

import com.javaedge.design.pattern.structural.proxy.Order;

/**
 * @author JavaEdge
 * @date 2018/9/17 00:01
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
