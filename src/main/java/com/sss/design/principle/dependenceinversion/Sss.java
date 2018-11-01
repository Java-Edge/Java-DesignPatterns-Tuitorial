package com.sss.design.principle.dependenceinversion;


/**
 * @author shishusheng
 */
public class Sss {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;

    public void studyProgramCourse(){
        iCourse.studyCourse();
    }

}
