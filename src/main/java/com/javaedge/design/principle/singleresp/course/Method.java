package com.javaedge.design.principle.singleresp.course;

/**
 * @author JavaEdge
 */
public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "Learner";
        address = "beijing";
    }

    /**
     * 可变长参数版本
     *
     * @param userName
     * @param properties
     */
    private void updateUserInfo(String userName, String... properties) {
        userName = "Learner";
//        address = "beijing";
    }

    private void updateUsername(String userName) {
        userName = "Learner";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            // todo
        } else {
            //todo
        }

        userName = "Learner";
        address = "beijing";
    }

}
