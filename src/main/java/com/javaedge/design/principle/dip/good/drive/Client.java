package com.javaedge.design.principle.dip.good.drive;

/**
 * @author JavaEdge
 * @date 2021/10/13
 */
public class Client {

    public static void main(String[] args) {

        IDriver java = new Driver();
        ICar benz = new Benz();
        java.drive(benz);
    }
}
