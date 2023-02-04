package com.javaedge.design.pattern.behavioral.state.demo0203;

import com.javaedge.design.pattern.behavioral.state.demo0201.IOrderService;
import com.javaedge.design.pattern.behavioral.state.demo0201.OrderInfo;
import com.javaedge.design.pattern.behavioral.state.demo0202.IOrderStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单服务抽象类
 *
 * @author JavaEdge
 * @date 2022/4/18
 */
public class AbstractOrderStateServiceV2 implements IOrderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractOrderStateServiceV2.class);
    protected Map<Integer, IReminderStateService> reminderStateServiceMap = new HashMap<>();
    protected IOrderService orderService;

    public AbstractOrderStateServiceV2(IOrderService orderService) {
        this.orderService = orderService;
        reminderStateServiceMap.put(ReminderStateEnum.BEFORE_DELIVER.getCode(), new BeforeDeliverReminderStateService(this.orderService));
        reminderStateServiceMap.put(ReminderStateEnum.AFTER_DELIVER.getCode(), new AfterDeliverReminderStateService(this.orderService));
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
