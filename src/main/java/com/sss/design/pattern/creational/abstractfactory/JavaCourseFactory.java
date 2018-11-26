package com.sss.design.pattern.creational.abstractfactory;

/**
 * @author sss
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
