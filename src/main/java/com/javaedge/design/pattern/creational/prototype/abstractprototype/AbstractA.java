package com.javaedge.design.pattern.creational.prototype.abstractprototype;

/**
 * @author JavaEdge
 */
public abstract class AbstractA implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
