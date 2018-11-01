package com.javaedge.design.principle.dip.good.drive;

/**
 * @author JavaEdge
 * @date 2021/10/13
 */
public class BMW implements ICar {

    @Override
    public void run() {
        System.out.println("宝马汽车开始运行...");
    }
}
