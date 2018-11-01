package com.javaedge.design.principle.dip.good.drive;

/**
 * @author JavaEdge
 * @date 2021/10/13
 */
public class Benz implements ICar {

    @Override
    public void run() {
        System.out.println("奔驰汽车开始运行...");
    }
}
