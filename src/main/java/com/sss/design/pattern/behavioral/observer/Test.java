package com.sss.design.pattern.behavioral.observer;

/**
 * @author sss
 * @date 2018/11/26
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式实战");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("sss");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course,question);

    }
}