package com.javaedge.design.principle.compositionaggregation;

/**
 * Created by JavaEdge
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
