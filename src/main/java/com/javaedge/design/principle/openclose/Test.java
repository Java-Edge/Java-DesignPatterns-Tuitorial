package com.javaedge.design.principle.openclose;

/**
 * @author JavaEdge
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从入门到精通", 348d);

        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;

        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() +
                " 课程原价:" + javaCourse.getPrice() + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");
    }
}

