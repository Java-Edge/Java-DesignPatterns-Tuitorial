package com.javaedge.design.principle.openclose.user;

/**
 * @author JavaEdge
 */
public class SilverUserLevel implements UserLevel {

    public double getRoomPrice(final Room room) {
        return room.getPrice() * 0.9;
    }
}
