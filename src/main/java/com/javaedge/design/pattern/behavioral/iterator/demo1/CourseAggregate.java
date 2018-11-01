package com.javaedge.design.pattern.behavioral.iterator.demo1;

/**
 * @author JavaEdge
 * @date 2018/10/11
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
