package com.javaedge.design.pattern.structural.proxy.dynamicproxy.jdkdynamicproxy.v1;

import org.azeckoski.reflectutils.ClassLoaderUtils;

import java.lang.reflect.Proxy;

/**
 * 测试例子
 *
 * @author JavaEdge
 * @date 2023/2/4
 */
public class TestProxy {

    public static void main(String[] args) {
        // 构建代理器
        JDKProxy proxy = new JDKProxy(new RealHello());
        ClassLoader classLoader = ClassLoaderUtils.getCurrentClassLoader();
        // 把生成的代理类保存到文件
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 生成代理类
        Hello test = (Hello) Proxy.newProxyInstance(classLoader, new Class[]{Hello.class}, proxy);
        // 方法调用
        System.out.println(test.say());
    }
}