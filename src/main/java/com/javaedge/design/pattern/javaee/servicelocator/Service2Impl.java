package com.javaedge.design.pattern.javaee.servicelocator;

/**
 * 实体服务
 *
 * @author JavaEdge
 * @date 2020/8/15
 */
public class Service2Impl implements Service {
    @Override
    public void execute(){
        System.out.println("Executing Service1Impl");
    }

    @Override
    public String getName() {
        return "Service2Impl";
    }
}
