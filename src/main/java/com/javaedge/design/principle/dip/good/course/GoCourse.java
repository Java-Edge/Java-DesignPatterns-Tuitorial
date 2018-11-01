package com.javaedge.design.principle.dip.good.course;

/**
 * @author JavaEdge
 */
public class GoCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("JavaEdge在学习Go课程");
    }

}
