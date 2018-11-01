package com.javaedge.design.pattern.structural.proxy.staticproxy;

import com.javaedge.design.pattern.structural.proxy.IOrderService;
import com.javaedge.design.pattern.structural.proxy.OrderServiceImpl;
import com.javaedge.design.pattern.structural.proxy.db.DataSourceContextHolder;
import com.javaedge.design.pattern.structural.proxy.Order;

/**
 * @author JavaEdge
 * @date 2018/9/16 23:31
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到[db" + dbRouter + "] 处理数据");

        // TODO:设置 dataSource;
        DataSourceContextHolder.setDbType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理 before code");

    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }

}
