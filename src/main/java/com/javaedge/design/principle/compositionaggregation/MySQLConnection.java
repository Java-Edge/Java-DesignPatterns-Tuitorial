package com.javaedge.design.principle.compositionaggregation;

/**
 * Created by Learner
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
