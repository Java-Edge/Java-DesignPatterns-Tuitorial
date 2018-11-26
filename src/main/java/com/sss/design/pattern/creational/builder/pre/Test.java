package com.sss.design.pattern.creational.builder.pre;

/**
 * @author sss
 */
public class Test {
    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java 设计模式",
                "Java 设计模式PPT",
                "Java 设计模式视频",
                "Java 设计模式博客",
                "Java 设计模式解疑");
        System.out.println(course);
    }
}
