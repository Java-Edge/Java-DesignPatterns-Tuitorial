package com.javaedge.design.pattern.behavioral.iterator.demo1;

import java.util.List;

/**
 * @author JavaEdge
 * @date 2018/10/11
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;
    Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程,位置是: " + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (position < courseList.size()) {
            return false;
        }
        return true;
    }
}
