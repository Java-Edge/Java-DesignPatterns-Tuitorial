package com.javaedge.design.principle.dependenceinversion;


/**
 * @author JavaEdge
 */
public class Test {

    public static void main(String[] args) {
        JavaEdge JavaEdge = new JavaEdge();
        JavaEdge.setiCourse(new JavaCourse());
        JavaEdge.studyProgramCourse();

        JavaEdge.setiCourse(new FeCourse());
        JavaEdge.studyProgramCourse();

    }


}
