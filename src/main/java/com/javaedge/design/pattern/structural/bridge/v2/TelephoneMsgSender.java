package com.javaedge.design.pattern.structural.bridge.v2;

import java.util.List;

/**
 * @author JavaEdge
 * @date 2022/5/23
 */
public class TelephoneMsgSender implements MsgSender {

    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        //...
    }

}
