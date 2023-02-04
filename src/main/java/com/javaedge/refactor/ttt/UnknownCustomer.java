package com.javaedge.refactor.ttt;

/**
 * @author JavaEdge
 * @date 2022/4/14
 */
public class UnknownCustomer extends Customer {

    @Override
    public boolean isUnknown() {
        return true;
    }
}
