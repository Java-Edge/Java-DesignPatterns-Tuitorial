package com.javaedge.design.pattern.creational.factory;

/**
 * @fun 黑色人种
 * @author JavaEdge
 * @date 2018/11/1
 */
public class BlackHuman implements Human {

    @Override
    public void getColor(){
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
