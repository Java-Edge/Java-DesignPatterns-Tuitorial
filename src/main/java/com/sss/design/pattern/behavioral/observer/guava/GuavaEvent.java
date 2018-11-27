package com.sss.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author sss
 * @date 2018/11/27
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
        //业务逻辑
        System.out.println("执行subscribe方法,传入的参数是:" + str);
    }

}
