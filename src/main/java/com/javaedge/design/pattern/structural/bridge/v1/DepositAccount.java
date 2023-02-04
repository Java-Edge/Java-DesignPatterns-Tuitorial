package com.javaedge.design.pattern.structural.bridge.v1;

/**
<<<<<<< Updated upstream:src/main/java/com/javaedge/design/pattern/structural/bridge/DepositAccount.java
 * Created by JavaEdge
=======
 * @author JavaEdge
>>>>>>> Stashed changes:src/main/java/com/javaedge/design/pattern/structural/bridge/v1/DepositAccount.java
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
