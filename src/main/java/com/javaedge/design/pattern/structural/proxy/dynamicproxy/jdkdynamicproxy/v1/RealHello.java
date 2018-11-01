package com.javaedge.design.pattern.structural.proxy.dynamicproxy.jdkdynamicproxy.v1;

/**
 * 真实调用对象
 *
 * @author JavaEdge
 * @date 2023/2/4
 */
public class RealHello {

    public String invoke(){
        return "i'm proxy";
    }
}