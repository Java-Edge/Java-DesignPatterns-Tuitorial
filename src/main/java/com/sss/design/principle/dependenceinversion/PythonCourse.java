package com.sss.design.principle.dependenceinversion;


/**
 * @author shishusheng
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Sss在学习Python课程");
    }
}
