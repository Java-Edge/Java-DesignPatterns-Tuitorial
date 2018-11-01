package com.sss.design.principle.dependenceinversion;


/**
 * @author shishusheng
 */
public class Test {

    public static void main(String[] args) {
        Sss sss = new Sss();
        sss.setiCourse(new JavaCourse());
        sss.studyProgramCourse();

        sss.setiCourse(new FeCourse());
        sss.studyProgramCourse();

    }


}
