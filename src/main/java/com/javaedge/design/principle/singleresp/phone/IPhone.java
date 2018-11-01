package com.javaedge.design.principle.singleresp.phone;

/**
 * @author JavaEdge
 * @date 2021/7/5
 */
public interface IPhone {

    /**
     * 拨通电话
     * @param phoneNumber 手机号
     */
    void dial(String phoneNumber);

    /**
     * 通话
     * @param o 对象
     */
    void chat(Object o);

    /**
     * 通话完毕，挂电话
     */
    void hangup();
}
