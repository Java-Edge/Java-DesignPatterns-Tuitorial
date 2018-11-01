package com.javaedge.design.principle.dip.good.course;

/**
 * @author JavaEdge
 */
public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("JavaEdge在学习Python课程");
    }
}
