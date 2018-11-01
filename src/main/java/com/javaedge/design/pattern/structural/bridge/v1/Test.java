package com.javaedge.design.pattern.structural.bridge.v1;

/**
<<<<<<< Updated upstream:src/main/java/com/javaedge/design/pattern/structural/bridge/Test.java
 * Created by JavaEdge
=======
 * @author JavaEdge
>>>>>>> Stashed changes:src/main/java/com/javaedge/design/pattern/structural/bridge/v1/Test.java
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
