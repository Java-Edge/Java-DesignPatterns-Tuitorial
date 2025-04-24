package com.javaedge.design.pattern.behavioral.iterator;

/**
 * @author JavaEdge
 * @date 2018/10/11
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();
}
