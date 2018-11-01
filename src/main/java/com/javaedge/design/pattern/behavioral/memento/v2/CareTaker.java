package com.javaedge.design.pattern.behavioral.memento.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JavaEdge
 * @date 2022/10/4
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
