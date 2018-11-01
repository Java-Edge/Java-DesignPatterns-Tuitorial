package com.javaedge.design.principle.openclose;

/**
 * @author JavaEdge
 */
public class JavaDiscountBook extends JavaBook {

    public JavaDiscountBook(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
