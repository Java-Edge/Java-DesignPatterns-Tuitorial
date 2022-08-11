package com.javaedge.design.pattern.creational.abstractfactory;

/**
 * Created by JavaEdge
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        CourseFactory courseFactory2 = new PythonCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
