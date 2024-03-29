package com.javaedge.design.pattern.behavioral.state.demo0205;


import com.javaedge.design.pattern.behavioral.state.demo0204.StateServerRole;

/**
 * 状态控方法stateServer4对应的辅助类
 *
 * @author JavaEdge
 * @date 2022/4/27
 */
public class StateServer4Helper {
    private final StateServerRole stateServerRole;

    public StateServer4Helper(StateServerRole stateServerRole) {
        this.stateServerRole = stateServerRole;
    }

    /**
     * @author: JavaEdge
     * @date: 2022/4/27
     * @param: []
     * @return: void
     */
    public void stateServer4ForBiz01() {
        //stateServer4 第一个专用业务逻辑
    }

    /**
     * @author: JavaEdge
     * @date: 2022/4/27
     * @param: []
     * @return: void
     */
    public void stateServer4ForBiz02() {
        //stateServer4 第二个专用业务逻辑
    }
}
