package com.javaedge.design.pattern.behavioral.state.demo0201;

import lombok.Data;

/**
 * 订单信息
 *
 * @author JavaEdge
 * @date 2022/4/16
 */
@Data
public class OrderInfo {
    /**
     * 订单id
     */
    private String ID;
    /**
     * 订单状态
     */
    private OrderStateEnum orderStateEnum;

}
