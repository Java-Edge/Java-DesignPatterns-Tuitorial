package com.javaedge.design.pattern.creational.factory.single;

import java.lang.reflect.Constructor;

/**
 * @author JavaEdge
 * @date 2018/11/1
 */
public class SingletonFactory {

    private static Singleton4 singleton4;

    static {
        try {
            Class cl = Class.forName(Singleton4.class.getName());
            // 获得无参构造器
            Constructor constructor = cl.getDeclaredConstructor();
            // 设置无参构造器可访问
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton4 = (Singleton4) constructor.newInstance();
        } catch (Exception e) {
            // 异常处理
        }
    }

    public static Singleton4 getSingleton4() {
        return singleton4;
    }
}
