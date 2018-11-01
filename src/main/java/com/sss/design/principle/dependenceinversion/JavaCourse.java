package com.sss.design.principle.dependenceinversion;


/**
 * @author shishusheng
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Sss在学习Java课程");
    }
}
