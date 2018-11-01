package com.javaedge.refactor.condition;

import java.time.LocalDate;

/**
 * @author JavaEdge
 * @date 2022/4/2
 */
public class Price {

    private static Long charge;

    /**
     * 在冬季和夏季的单价不同
     */
    public static void price(LocalDate aDate, Plan plan, Long quantity) {
        charge = summer(aDate, plan) ? summerCharge(plan, quantity) : regularCharge(plan, quantity);
    }

    /**
     * 条件判断为假的分支
     */
    private static Long regularCharge(Plan plan, Long quantity) {
        return quantity * plan.regularRate + plan.regularServiceCharge;
    }

    public static boolean summer(LocalDate aDate, Plan plan) {
        return !aDate.isBefore(plan.summerStart) && !aDate.isAfter(plan.summerEnd);
    }

    /**
     * 提炼条件判断为真的分支
     */
    public static Long summerCharge(Plan plan, Long quantity) {
        return quantity * plan.summerRate;
    }
}
