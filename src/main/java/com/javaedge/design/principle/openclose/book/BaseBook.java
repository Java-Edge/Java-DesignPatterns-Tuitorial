package com.javaedge.design.principle.openclose.book;

/**
 * 书籍接口
 *
 * @author JavaEdge
 */
public interface BaseBook {

    /**
     * 获取书籍 ID
     *
     * @return 书籍 ID
     */
    Integer getId();

    /**
     * 获取书籍名
     *
     * @return 书籍名
     */
    String getName();

    /**
     * 获取书籍价
     *
     * @return 书籍价
     */
    Double getPrice();
}
