package com.sss.design.pattern.structural.proxy;

/**
 * @author shishusheng
 * @date 2018/9/16 23:20
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao 层添加 Order 成功");
        return 1;
    }

}
