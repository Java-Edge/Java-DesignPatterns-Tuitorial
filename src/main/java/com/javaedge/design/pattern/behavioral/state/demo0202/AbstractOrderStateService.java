package com.javaedge.design.pattern.behavioral.state.demo0202;

import com.javaedge.design.pattern.behavioral.state.demo0201.IOrderService;
import com.javaedge.design.pattern.behavioral.state.demo0201.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 订单状态服务抽象类
 * @author JavaEdge
 * @date 2022/4/18
 */
public abstract class AbstractOrderStateService implements IOrderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractOrderStateService.class);
    protected IOrderService orderService;
    public AbstractOrderStateService(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public boolean pay(OrderInfo orderInfo) {
        LOG.info("订单状态：{},无法支付", orderInfo.getOrderStateEnum().getName());
        return false;
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        LOG.info("订单状态：{},无法催单", orderInfo.getOrderStateEnum().getName());
        return false;
    }

    @Override
    public boolean delete(OrderInfo orderInfo) {
        LOG.info("订单状态：{},无法删除", orderInfo.getOrderStateEnum().getName());
        return false;
    }

}
