package com.javaedge.design.pattern.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author JavaEdge
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() +
                "课程，接收到一个" + question.getUserName() +
                "提交的问题：" + question.getQuestionContent());
    }
}

