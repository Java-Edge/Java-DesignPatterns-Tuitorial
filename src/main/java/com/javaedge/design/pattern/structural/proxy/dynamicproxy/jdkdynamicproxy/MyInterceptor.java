package com.javaedge.design.pattern.structural.proxy.dynamicproxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理-拦截器
 *
 * @author JavaEdge
 */
public class MyInterceptor implements InvocationHandler {

    /**
     * 动态代理好在可以接受任意类型的目标对象
     */
    private Object target;

    public MyInterceptor(Object target) {
        this.target = target;
    }

    /**
     * 该方法不是我们显式去调用的
     *
     * @param args   目标方法的参数
     * @param method 目标方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before calling " + method);

        // 调用目标类的目标方法
        method.invoke(this.target, args);

        System.out.println("after calling " + method);

        return null;
    }
}
