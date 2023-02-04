package com.javaedge.design.pattern.structural.bridge.v1;

/**
<<<<<<< Updated upstream:src/main/java/com/javaedge/design/pattern/structural/bridge/ABCBank.java
 * Created by JavaEdge
=======
 * @author JavaEdge
>>>>>>> Stashed changes:src/main/java/com/javaedge/design/pattern/structural/bridge/v1/ABCBank.java
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
