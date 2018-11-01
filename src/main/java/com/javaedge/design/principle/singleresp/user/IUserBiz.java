package com.javaedge.design.principle.singleresp.user;

/**
 * 负责用户的行为
 *
 * @author JavaEdge
 * @date 2021/7/5
 */
public interface IUserBiz {

    boolean changePassword(String oldPassword);

    boolean deleteUser();

    void mapUser();

    boolean addOrg(int orgId);

    boolean addRole(int roleId);
}
