package com.javaedge.design.principle.openclose.user;

/**
 * @author JavaEdge
 */
public class GoldUserLevel implements UserLevel{

    /**
     * 获取书籍 ID
     *
     * @return 书籍 ID
     */
    public double getRoomPrice(final Room room) {
        return room.getPrice() * 0.8;
    }
}
