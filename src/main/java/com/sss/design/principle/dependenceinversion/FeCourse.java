package com.sss.design.principle.dependenceinversion;

/**
 * @author shishusheng
 */
public class FeCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Sss在学习FE课程");
    }

}
