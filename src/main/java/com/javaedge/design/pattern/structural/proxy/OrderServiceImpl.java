package com.javaedge.design.pattern.structural.proxy;

/**
 * @author JavaEdge
 * @date 2018/9/16 23:22
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        // Spring 会自动注入,演示直接 new
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service 层调用 Dao 层添加 Order");
        return iOrderDao.insert(order);
    }
}
