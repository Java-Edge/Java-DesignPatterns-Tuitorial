package com.sss.design.pattern.creational.prototype.abstractprototype;

/**
 * @author sss
 */
public abstract class AbstractA implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
