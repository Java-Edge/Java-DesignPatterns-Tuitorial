package com.javaedge.design.principle.interfacesegregation.v2;

public class Door {
    void lock() {
    }

    void unlock() {
    }

    boolean isDoorOpen() {
        return false;
    }

    void timeout() {
        lock();
    }
}
