package com.javaedge.design.pattern.behavioral.state.demo0203;

import com.javaedge.design.pattern.behavioral.state.demo0201.IOrderService;
import com.javaedge.design.pattern.behavioral.state.demo0201.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 催单方法：适合所有发货前的状态
 *
 * @author JavaEdge
 * @date 2022/4/18
 */
public class BeforeDeliverReminderStateService implements IReminderStateService {
    private static final Logger LOG = LoggerFactory.getLogger(BeforeDeliverReminderStateService.class);
    private final IOrderService orderService;

    public BeforeDeliverReminderStateService(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public boolean reminder(OrderInfo orderInfo) {
        // biz code
        LOG.info("发货前催单成功");
        return true;
    }
}
