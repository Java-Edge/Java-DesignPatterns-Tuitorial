package com.javaedge.design.pattern.creational.factory;

/**
 * @fun 人类总称
 * @author JavaEdge
 * @date 2018/11/1
 */
public interface Human {
    /**
     * 每个人种的皮肤都有相应的颜色
     */
    public void getColor();

    /**
     * 人类会说话
     */
    public void talk();
}
