package com.javaedge.refactor.ttt;

import lombok.Getter;

import java.util.Collection;

/**
 * @author JavaEdge
 * @date 2022/4/1
 */
@Getter
public class Order {

    private Customer customer;

    public Order(String customerName) {
        customer = Customer.getNamed(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    void setCustomerName(String customerName) {
        this.customer.setName(customerName);
    }

    private static int numberOfOrdersFor(Collection<Order> orders, String customer) {
        int result = 0;

        for (Order each : orders) {
            if (each.getCustomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}



