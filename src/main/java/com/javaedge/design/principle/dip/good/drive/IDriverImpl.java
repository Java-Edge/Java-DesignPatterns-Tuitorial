package com.javaedge.design.principle.dip.good.drive;

/**
 * @author JavaEdge
 * @date 2021/10/13
 */
public class IDriverImpl implements IDriver {

    private ICar car;

    /**
     * 构造器注入
     *
     * @param car
     */
    public IDriverImpl(ICar car) {
        this.car = car;
    }

    public void drive() {
        this.car.run();
    }

    @Override
    public void drive(ICar car) {

    }
}
