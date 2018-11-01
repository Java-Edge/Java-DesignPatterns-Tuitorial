package com.javaedge.refactor.nine;

import com.javaedge.refactor.TelephoneNumber;

/**
 * @author JavaEdge
 * @date 2022/3/30
 */
public class Person {

    private TelephoneNumber telephoneNumber;

//    Person() {
//        this.telephoneNumber = new TelephoneNumber();
//    }

    String getOfficeAreaCode() {
        return this.telephoneNumber.getAreaCode();
    }

    void setOfficeAreaCode(String arg) {
        this.telephoneNumber.setAreaCode(arg);
    }

    String getOfficeNumber() {
        return this.telephoneNumber.getNumber();
    }

    void setOfficeNumber(String arg) {
        this.telephoneNumber.setNumber(arg);

    }

    public static void main(String[] args) {
        Boolean failedStatus = Boolean.FALSE;
        judgeFailedStatus(failedStatus);
        System.out.println(failedStatus);
    }

    private static void judgeFailedStatus(Boolean failedStatus) {
        failedStatus = Boolean.TRUE;
    }
}
