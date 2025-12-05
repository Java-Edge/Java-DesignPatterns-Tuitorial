package com.javaedge.design.pattern.behavioral.state.demo0206;

/**
 * 停止状态
 *
 * @author JavaEdge
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}

