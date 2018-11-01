package com.javaedge.refactor.extract_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JavaEdge
 * @date 2022/3/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelephoneNumber {

    private String areaCode;

    private String number;

    public String getTelephoneNumber() {
        return this.areaCode + this.number;
    }
}
