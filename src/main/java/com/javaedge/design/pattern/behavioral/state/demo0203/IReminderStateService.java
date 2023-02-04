package com.javaedge.design.pattern.behavioral.state.demo0203;


import com.javaedge.design.pattern.behavioral.state.demo0201.OrderInfo;

/**
 * 催单方法的特定状态服务方-接口
 *
 * @author JavaEdge
 * @date 2022/4/18
 */
public interface IReminderStateService {
    /**
     * 催单
     *
     * @author: JavaEdge
     * @date: 2022/4/15
     * @param: [orderID, message]
     * @return: void
     */
    boolean reminder(OrderInfo orderInfo);
}
