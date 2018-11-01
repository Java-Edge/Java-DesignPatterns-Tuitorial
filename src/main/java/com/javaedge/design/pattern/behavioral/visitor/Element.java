package com.javaedge.design.pattern.behavioral.visitor;

/**
 * @author JavaEdge
 * @date 2021/12/10
 */
public interface Element {
    void accept(Visitor visitor);
}
