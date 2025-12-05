package com.javaedge.design.pattern.behavioral.state.demo0206;

/**
 * 状态模式演示
 *
 * @author JavaEdge
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println("Current State: " + context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println("Current State: " + context.getState().toString());
    }
}

