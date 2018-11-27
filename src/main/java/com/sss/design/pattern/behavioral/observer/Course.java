package com.sss.design.pattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Observable;

/**
 * @author sss
 * @date 2018/11/26
 */
@Getter
@AllArgsConstructor
public class Course extends Observable {
    private String courseName;

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName + "提交了一个 issue");
        setChanged();
        // 通知观察者
        notifyObservers(question);

    }
}
