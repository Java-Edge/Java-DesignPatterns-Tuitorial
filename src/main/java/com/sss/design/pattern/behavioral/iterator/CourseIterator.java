package com.sss.design.pattern.behavioral.iterator;

/**
 * @author sss
 * @date 2018/10/11
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();
}
