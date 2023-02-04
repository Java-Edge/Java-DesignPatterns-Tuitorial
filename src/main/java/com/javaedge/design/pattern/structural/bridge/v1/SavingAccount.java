package com.javaedge.design.pattern.structural.bridge.v1;

/**
<<<<<<< Updated upstream:src/main/java/com/javaedge/design/pattern/structural/bridge/SavingAccount.java
 * Created by JavaEdge
=======
 * @author JavaEdge
>>>>>>> Stashed changes:src/main/java/com/javaedge/design/pattern/structural/bridge/v1/SavingAccount.java
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        //...
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
