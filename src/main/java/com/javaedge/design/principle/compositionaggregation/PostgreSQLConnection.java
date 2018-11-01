package com.javaedge.design.principle.compositionaggregation;

/**
 * Created by JavaEdge
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
