package com.javaedge.design.principle.interfacesegregation.v2;

public class TimedDoor extends Door implements TimerClient  {

    @Override
    public void timeout() {

    }
}
