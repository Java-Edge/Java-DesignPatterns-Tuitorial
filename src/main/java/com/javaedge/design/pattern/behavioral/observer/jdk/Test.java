package com.javaedge.design.pattern.behavioral.observer.jdk;

/**
 * @author JavaEdge
 */
public class Test {

    public static void main(String[] args) {

        Course course = new Course("Java设计模式实战");
        Teacher teacher1 = new Teacher("Java");
        Teacher teacher2 = new Teacher("大数据");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        // 业务逻辑
        Question question = Question.builder()
                .userName("Learner")
                .questionContent("如何编写Java的观察者模式？")
                .build();

        course.produceQuestion(course, question);

    }
}