package com.javaedge.design.pattern.creational.builder.pre;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author JavaEdge
 * @date 2018/11/9
 */
@Setter
@Getter
@ToString
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;
}
