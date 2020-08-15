package com.javaedge.design.principle.openclose;


/**
 * @author JavaEdge
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }

}
