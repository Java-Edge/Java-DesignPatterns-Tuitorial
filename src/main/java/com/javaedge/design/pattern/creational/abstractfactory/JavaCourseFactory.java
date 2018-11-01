package com.javaedge.design.pattern.creational.abstractfactory;

/**
 * @author JavaEdge
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override

    public Article getArticle() {
        return new JavaArticle();
    }
}
