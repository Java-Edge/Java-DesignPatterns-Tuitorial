package com.javaedge.design.principle.dip.good.drive;

/**
 * @author JavaEdge
 * @date 2021/10/13
 */
public interface IDriver {

    /**
     * 司机就应该会驾驶汽车
     * @param car 汽车
     */
    void drive(ICar car);
}
