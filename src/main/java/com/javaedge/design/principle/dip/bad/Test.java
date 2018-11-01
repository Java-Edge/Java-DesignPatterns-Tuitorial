package com.javaedge.design.principle.dip.bad;

/**
 * @author JavaEdge
 * @date 2021/10/13
 */
public class Test {

    public static void main(String[] args) {
        Learner learner = new Learner();
        learner.studyJavaCourse();
        learner.studyGoCourse();
        learner.studyPythonCourse();
    }
}
