package com.javaedge.design.pattern.creational.abstractfactoryadd;

/**
 * @author JavaEdge
 * @date 2018/11/7
 */
public abstract class AbstractWhiteHuman implements Human {
    /**
     * 白色人种的皮肤颜色是白色的
     */
    @Override
    public void getColor(){
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    /**
     * 白色人种讲话
     */
    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节");
    }
}
