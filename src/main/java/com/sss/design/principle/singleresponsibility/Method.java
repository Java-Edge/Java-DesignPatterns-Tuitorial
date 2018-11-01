package com.sss.design.principle.singleresponsibility;

/**
 * @author shishusheng
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "sss";
        address = "beijing";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "sss";
//        address = "beijing";
    }

    private void updateUsername(String userName){
        userName = "sss";
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

        userName = "sss";
        address = "beijing";
    }

}
