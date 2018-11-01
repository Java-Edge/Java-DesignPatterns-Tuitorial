package com.javaedge.design.pattern.structural.bridge.v2;

import com.javaedge.design.pattern.structural.bridge.v2.refactor.Notification;

/**
 * @author JavaEdge
 * @date 2022/5/23
 */
public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
