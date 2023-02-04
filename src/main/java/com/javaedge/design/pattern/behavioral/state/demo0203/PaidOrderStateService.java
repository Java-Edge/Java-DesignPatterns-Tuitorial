package com.javaedge.design.pattern.behavioral.state.demo0203;

import com.javaedge.design.pattern.behavioral.state.demo0201.IOrderService;
import com.javaedge.design.pattern.behavioral.state.demo0201.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 已支付订单状态服务
 *
 * @author JavaEdge
 * @date 2022/4/18
 */
public class PaidOrderStateService extends AbstractOrderStateServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(PaidOrderStateService.class);

    public PaidOrderStateService(IOrderService orderService) {
        super(orderService);
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        return reminderStateServiceMap.get(ReminderStateEnum.BEFORE_DELIVER.getCode()).reminder(orderInfo);
    }
}
