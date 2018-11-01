package com.javaedge.refactor.extract_class;

import lombok.Data;

/**
 * @author JavaEdge
 * @date 2022/3/30
 */
@Data
public class Person {

    private String name;

    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }

}

