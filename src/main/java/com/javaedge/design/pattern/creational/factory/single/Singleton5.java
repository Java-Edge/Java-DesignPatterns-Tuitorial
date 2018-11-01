package com.javaedge.design.pattern.creational.factory.single;

/**
 * @author JavaEdge
 */
public class Singleton5 {

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {}

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
