package com.sss.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author sss
 * @date 2018/11/27
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        eventbus.post("post的内容");
    }

}

