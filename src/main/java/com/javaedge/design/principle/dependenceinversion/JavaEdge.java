package com.javaedge.design.principle.dependenceinversion;


/**
 * @author JavaEdge
 */
public class JavaEdge {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;

    public void studyProgramCourse(){
        iCourse.studyCourse();
    }

}
