package com.javaedge.design.pattern.structural.bridge;

/**
 * Created by JavaEdge
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
