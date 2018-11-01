package com.javaedge.refactor.movemethod;

/**
 * @author JavaEdge
 * @date 2022/3/31
 */
public class AccountType {

    public boolean isPremium() {
        return true;
    }

    /**
     * 透支金额计费规则
     *
     * @return
     */
    public double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }

    public double overdraftCharge(Account account) {
        if (isPremium()) {
            double result = 10;
            if (account.getDaysOverdrawn() > 7) {
                result += (account.getDaysOverdrawn() - 7) * 0.85;
            }
            return result;
        } else {
            return account.getDaysOverdrawn() * 1.75;
        }
    }
}
