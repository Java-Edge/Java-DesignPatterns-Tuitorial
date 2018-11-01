package com.javaedge.design.principle.dip.good.course;

/**
 * @author JavaEdge
 */
public class Learner {

    private ICourse iCourse;

    public void setCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyProgramCourse() {
        iCourse.studyCourse();
    }
}

