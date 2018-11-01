package com.javaedge.design.pattern.structural.bridge.v2.refactor;

import com.javaedge.design.pattern.structural.bridge.v2.MsgSender;

/**
 * @author JavaEdge
 * @date 2022/5/23
 */
public abstract class Notification {

    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}