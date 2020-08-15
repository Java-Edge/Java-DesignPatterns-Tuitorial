package com.javaedge.design.principle.dependenceinversion;


/**
 * @author JavaEdge
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Sss在学习Java课程");
    }
}
