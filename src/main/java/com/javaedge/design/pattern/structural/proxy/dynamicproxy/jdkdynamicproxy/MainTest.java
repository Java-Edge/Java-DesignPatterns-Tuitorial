package com.javaedge.design.pattern.structural.proxy.dynamicproxy.jdkdynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 具体通过调用代理对象，来调用目标对象的目标方法的具体测试
 *
 * @author JavaEdge
 * @date 2021/6/10
 */
public class MainTest {

    public static void main(String[] args) {
        // 目标对象
        TargetObject target = new TargetObject();
        // 拦截器
        MyInterceptor myInterceptor = new MyInterceptor(target);

        /*
         *  Proxy.newProxyInstance参数：
         *  1、目标类的类加载器
         *  2、目标类的所有的接口
         *  3、拦截器
         */
        // 代理对象，调用系统方法自动生成
        TargetInterface proxyObj = (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                myInterceptor);
        proxyObj.business();
    }
}
