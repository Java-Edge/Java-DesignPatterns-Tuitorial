package com.javaedge.design.pattern.structural.proxy.dynamicproxy.jdkdynamicproxy;

/**
 * 被代理的类、目标对象类。
 * 实现目标接口，继而实现目标方法。
 * @author JavaEdge
 */
public class TargetObject implements TargetInterface {

    /**
     * 目标方法
     */
    @Override
    public void business() {
        System.out.println("business");
    }
}
