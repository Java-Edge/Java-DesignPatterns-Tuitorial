package com.javaedge.design.pattern.javaee.servicelocator;

/**
 * @author JavaEdge
 * @date 2020/8/15
 */
public class ServiceLocatorPatternTest {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1Impl");
        service.execute();
        service = ServiceLocator.getService("Service2Impl");
        service.execute();
        service = ServiceLocator.getService("Service1Impl");
        service.execute();
        service = ServiceLocator.getService("Service2Impl");
        service.execute();
    }
}
