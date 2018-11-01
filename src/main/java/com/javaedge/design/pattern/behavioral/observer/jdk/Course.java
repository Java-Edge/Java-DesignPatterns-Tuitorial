package com.javaedge.design.pattern.behavioral.observer.jdk;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Observable;

/**
 * @author JavaEdge
 */
@Getter
@AllArgsConstructor
public class Course extends Observable {

    private String courseName;

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName + "课程，提了一个问题");
        setChanged();
        // 通知观察者
        notifyObservers(question);
    }
}
