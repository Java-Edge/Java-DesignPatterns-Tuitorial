package com.javaedge.design.pattern.structural.bridge.v1;

/**
<<<<<<< Updated upstream:src/main/java/com/javaedge/design/pattern/structural/bridge/Bank.java
 * Created by JavaEdge
=======
 * @author JavaEdge
>>>>>>> Stashed changes:src/main/java/com/javaedge/design/pattern/structural/bridge/v1/Bank.java
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
