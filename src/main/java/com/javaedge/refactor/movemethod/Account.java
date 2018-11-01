package com.javaedge.refactor.movemethod;

import lombok.Data;

/**
 * @author JavaEdge
 * @date 2022/3/31
 */
@Data
public class Account {

    private AccountType type;

    private int daysOverdrawn;

    public double bankcharge() {
        double result = 4.5;
        if (this.daysOverdrawn > 0) {
            result += this.type.overdraftCharge(this.daysOverdrawn);
        }
        return result;
    }
}
