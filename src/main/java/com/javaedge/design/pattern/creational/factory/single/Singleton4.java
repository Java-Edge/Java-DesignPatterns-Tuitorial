package com.javaedge.design.pattern.creational.factory.single;

/**
 * @author JavaEdge
 */
public class Singleton4 {

    private volatile static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        // 第一次 check
        // 可能有多个线程一起进入此处的if
        if (instance == null) {
            synchronized (Singleton4.class) {
                // 第二次 check
                // 所以要进行二次检验，否则会生成多实例
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
