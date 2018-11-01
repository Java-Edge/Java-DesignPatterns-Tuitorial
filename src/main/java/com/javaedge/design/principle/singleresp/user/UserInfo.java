package com.javaedge.design.principle.singleresp.user;

/**
 * @author JavaEdge
 * @date 2021/7/5
 */
public class UserInfo implements IUserInfo {

    private String userName;
    private String userId;
    private String password;

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean changePassword(String oldPassword){
        System.out.println("");
        return true;
    }

    @Override
    public boolean deleteUser(){
        System.out.println("");
        return true;
    }

    @Override
    public void mapUser(){
        System.out.println("");
    }

    @Override
    public boolean addOrg(int orgId) {
        return false;
    }

    @Override
    public boolean addRole(int roleId) {
        return false;
    }
}

