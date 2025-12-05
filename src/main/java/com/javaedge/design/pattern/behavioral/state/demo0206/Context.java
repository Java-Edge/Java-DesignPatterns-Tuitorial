package com.javaedge.design.pattern.behavioral.state.demo0206;

import lombok.Data;

/**
 * 上下文类
 *
 * @author JavaEdge
 */
@Data
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }
}

