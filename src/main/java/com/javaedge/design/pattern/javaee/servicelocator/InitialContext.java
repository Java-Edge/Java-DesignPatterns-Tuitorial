package com.javaedge.design.pattern.javaee.servicelocator;

/**
 * 为 JNDI 查询创建 InitialContext
 *
 * @author JavaEdge
 * @date 2020/8/15
 */
public class InitialContext {
    public Object lookup(String jndiName){
        if("SERVICE1IMPL".equalsIgnoreCase(jndiName)){
            System.out.println("Looking up and creating a new Service1Impl object");
            return new Service1Impl();
        }else if ("SERVICE2IMPL".equalsIgnoreCase(jndiName)){
            System.out.println("Looking up and creating a new Service2Impl object");
            return new Service2Impl();
        }
        return null;
    }
}
