package com.javaedge.design.principle.dip.good.course;


/**
 * @author JavaEdge
 */
public class Test {

    public static void main(String[] args) {
        Learner learner = new Learner();
        learner.setCourse(new JavaCourse());
        learner.studyProgramCourse();

        learner.setCourse(new GoCourse());
        learner.studyProgramCourse();

    }


}
