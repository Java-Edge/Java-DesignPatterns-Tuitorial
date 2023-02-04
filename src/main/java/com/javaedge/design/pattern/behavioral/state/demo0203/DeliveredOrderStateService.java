package com.javaedge.design.pattern.behavioral.state.demo0203;

import com.javaedge.design.pattern.behavioral.state.demo0201.IOrderService;
import com.javaedge.design.pattern.behavioral.state.demo0201.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 已发货订单状态服务
 *
 * @author JavaEdge
 * @date 2022/4/18
 */
public class DeliveredOrderStateService extends AbstractOrderStateServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(DeliveredOrderStateService.class);

    public DeliveredOrderStateService(IOrderService orderService) {
        super(orderService);
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        return reminderStateServiceMap.get(ReminderStateEnum.AFTER_DELIVER.getCode()).reminder(orderInfo);
    }
}
