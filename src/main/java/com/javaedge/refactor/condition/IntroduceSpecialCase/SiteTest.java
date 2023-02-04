package com.javaedge.refactor.condition.IntroduceSpecialCase;

import com.javaedge.refactor.condition.Plan;
import com.javaedge.refactor.ttt.Customer;

/**
 * int@author JavaEdge
 * @date 2022/4/13
 */
public class SiteTest {

    private static Customer registry;

    public String getName(Site site) throws Exception {
        Customer customer = site.getCustomer();
        String customerName;
        if (isUnknown(customer)) {
            customerName = "occupant";
        } else {
            customerName = customer.getName();
        }
        return customerName;
    }

    public Plan getPlan(Site site) throws Exception {
        Customer customer = site.getCustomer();
        return (isUnknown(customer)) ?
                registry.getBillingPlan().basic
                : customer.getBillingPlan();
    }

    public void setBillingPlan(Site site, Plan newPlan) throws Exception {
        Customer customer = site.getCustomer();
        if (!isUnknown(customer)) {
            customer.setBillingPlan(newPlan);
        }
    }

    public void setWeeksDelinquent(Site site) throws Exception {
        Customer customer = site.getCustomer();
        int weeksDelinquent = (isUnknown(customer)) ?
                0
                : customer.getPaymentHistory().getWeeksDelinquentInLastYear();
    }

    public boolean isUnknown(Object arg) throws Exception {
        if (!((arg instanceof Customer)
                || ("unknown".equals(arg)))) {
            throw new Exception();
        }
        return ("unknown".equals(arg));
    }
}
