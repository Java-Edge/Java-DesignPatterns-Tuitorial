package com.javaedge.refactor;

import lombok.Data;

/**
 * @author JavaEdge
 * @date 2022/3/30
 */
@Data
public class TelephoneNumber {

    private String areaCode;

    private String number;

    TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getTelephoneNumber() {
        return areaCode + number;
    }
}
