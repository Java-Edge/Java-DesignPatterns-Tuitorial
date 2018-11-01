package com.javaedge.refactor.ttt;

import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JavaEdge
 * @date 2022/4/1
 */
@Data
class Customer {

    private String name;

    private static Map<String, Customer> instances = new HashMap<>();

    private Customer(String name) {
        this.name = name;
    }

    public static Customer getNamed(String name) {
        return instances.get(name);
    }

    static void loadCustomers() {
        new Customer("Java").store();
        new Customer("Edge").store();
        new Customer("公众号").store();
    }

    private void store() {
        instances.put(this.getName(), this);
    }
}
