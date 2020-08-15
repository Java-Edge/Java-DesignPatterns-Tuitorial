package com.javaedge.design.pattern.structural.proxy;

/**
 * @author JavaEdge
 * @date 2018/9/16 23:20
 */
public interface IOrderDao {

    /**
     * 插入库存
     *
     * @param order
     * @return
     */
    int insert(Order order);

}
