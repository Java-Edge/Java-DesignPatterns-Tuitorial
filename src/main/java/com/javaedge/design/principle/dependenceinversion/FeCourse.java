package com.javaedge.design.principle.dependenceinversion;

/**
 * @author JavaEdge
 */
public class FeCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Sss在学习FE课程");
    }

}
