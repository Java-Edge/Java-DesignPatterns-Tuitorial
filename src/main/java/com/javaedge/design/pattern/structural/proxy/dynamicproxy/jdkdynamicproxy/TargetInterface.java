package com.javaedge.design.pattern.structural.proxy.dynamicproxy.jdkdynamicproxy;

/**
 * 目标接口：包含目标方法的声明
 * JDK动态代理只能代理接口
 *
 * @author JavaEdge
 */
public interface TargetInterface {

    /**
     * 目标方法
     */
    void business();
}
