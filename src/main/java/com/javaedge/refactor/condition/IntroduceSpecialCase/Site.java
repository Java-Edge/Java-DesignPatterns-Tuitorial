package com.javaedge.refactor.condition.IntroduceSpecialCase;

import com.javaedge.refactor.ttt.Customer;
import com.javaedge.refactor.ttt.UnknownCustomer;
import lombok.Data;

/**
 * 场所
 *
 * @author JavaEdge
 * @date 2022/4/13
 */
@Data
public class Site {

    private Customer customer;

    public Customer getCustomer() {
        return "unknown".equals(this.customer.getName())
                ? new UnknownCustomer()
                : this.customer;
    }
}
