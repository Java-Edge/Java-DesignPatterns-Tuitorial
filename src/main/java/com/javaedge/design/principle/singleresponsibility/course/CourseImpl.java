package com.javaedge.design.principle.singleresponsibility.course;

/**
 * @author JavaEdge
 */
public class CourseImpl implements ICourseManager,ICourseContent {
    @Override
    public void studyCourse() { }

    @Override
    public void refundCourse() {}

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }
}
