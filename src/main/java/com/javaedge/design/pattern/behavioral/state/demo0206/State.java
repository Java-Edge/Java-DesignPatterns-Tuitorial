package com.javaedge.design.pattern.behavioral.state.demo0206;

/**
 * 状态接口
 *
 * @author JavaEdge
 */
public interface State {
    /**
     * 执行动作
     *
     * @param context 上下文
     */
    void doAction(Context context);
}


