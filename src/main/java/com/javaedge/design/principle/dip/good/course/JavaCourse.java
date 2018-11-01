package com.javaedge.design.principle.dip.good.course;

/**
 * @author JavaEdge
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("JavaEdge在学习Java课程");
    }
}
