package com.sss.design;

public class MyServiceImpl implements MyService {

    @Override
    public void fooA(String msg) {
        System.out.println("MyServiceImpl.fooA(msg:" + msg + ")");
    }

    @Override
    public void barA() {
        System.out.println("MyServiceImpl.barA()");
    }
}
