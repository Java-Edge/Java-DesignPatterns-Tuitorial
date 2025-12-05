package com.javaedge.design.pattern.behavioral.state.demo0206;

/**
 * 启动状态
 *
 * @author JavaEdge
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}

