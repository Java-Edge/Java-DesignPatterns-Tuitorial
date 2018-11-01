package com.javaedge.design.principle.dip.good.drive;

/**
 * @author JavaEdge
 * @date 2021/10/13
 */
public class Driver implements IDriver{

    @Override
    public void drive(ICar car){
        car.run();
    }
}
