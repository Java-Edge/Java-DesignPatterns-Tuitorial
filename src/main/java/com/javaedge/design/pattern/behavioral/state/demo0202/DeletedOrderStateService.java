package com.javaedge.design.pattern.behavioral.state.demo0202;

import com.javaedge.design.pattern.behavioral.state.demo0201.IOrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * 已删除订单状态服务
 *
 * @author JavaEdge
 * @date 2022/4/18
 */
@Slf4j
public class DeletedOrderStateService extends AbstractOrderStateService {

    public DeletedOrderStateService(IOrderService orderService) {
        super(orderService);
    }
}
