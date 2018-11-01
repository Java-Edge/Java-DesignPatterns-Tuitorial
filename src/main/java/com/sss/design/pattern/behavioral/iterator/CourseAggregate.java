package com.sss.design.pattern.behavioral.iterator;

/**
 * @author sss
 * @date 2018/10/11
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
