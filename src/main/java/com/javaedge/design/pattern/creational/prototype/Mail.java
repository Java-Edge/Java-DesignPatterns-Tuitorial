package com.javaedge.design.pattern.creational.prototype;

import lombok.Data;

/**
 * @author JavaEdge
 */
@Data
public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;

    public Mail(){
        System.out.println("Mail Class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
