package com.javaedge.design.principle.dependenceinversion;


/**
 * @author JavaEdge
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Sss在学习Python课程");
    }
}
