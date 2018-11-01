package com.javaedge.design.pattern.behavioral.memento.v2;

import lombok.Data;

/**
 * @author JavaEdge
 * @date 2022/10/4
 */
@Data
public class Originator {

    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
