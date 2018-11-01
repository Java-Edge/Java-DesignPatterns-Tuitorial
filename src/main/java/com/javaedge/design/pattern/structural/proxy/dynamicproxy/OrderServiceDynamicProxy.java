package com.javaedge.design.pattern.structural.proxy.dynamicproxy;

import com.javaedge.design.pattern.structural.proxy.Order;
import com.javaedge.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author JavaEdge
 * @date 2018/9/17 00:44
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    /**
     * 目标对象
     */
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object object) {
        int userId = 0;

        System.out.println("动态代理 before code");
        if (object instanceof Order) {
            Order order = (Order) object;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("动态代理分配到[db" + dbRouter + "] 处理数据");

        // 确定目标 db
        DataSourceContextHolder.setDbType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}
