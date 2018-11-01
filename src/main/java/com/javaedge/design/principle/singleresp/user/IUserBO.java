package com.javaedge.design.principle.singleresp.user;

/**
 * 负责用户的属性
 *
 * @author JavaEdge
 * @date 2021/7/5
 */
interface IUserBO {

    void setUserId(String userId);

    String getUserId();

    void setPassword(String password);

    String getPassword();

    void setUserName(String userName);

    String getUserName();
}
