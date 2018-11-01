package com.javaedge.design.pattern.structural.proxy.dynamicproxy.jdkdynamicproxy.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK代理类生成
 *
 * @author JavaEdge
 * @date 2023/2/4
 */
public class JDKProxy implements InvocationHandler {
    private Object target;

    JDKProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] paramValues) {
        return ((RealHello)target).invoke();
    }
}
