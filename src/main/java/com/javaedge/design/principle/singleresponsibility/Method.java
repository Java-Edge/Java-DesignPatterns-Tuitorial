package com.javaedge.design.principle.singleresponsibility;

/**
 * @author JavaEdge
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "JavaEdge";
        address = "beijing";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "JavaEdge";
//        address = "beijing";
    }

    private void updateUsername(String userName){
        userName = "JavaEdge";
    }
    private void updateUserAddress(String address){
        address = "beijing";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo something1
        }else{
            //todo something2
        }

        userName = "JavaEdge";
        address = "beijing";
    }

}
