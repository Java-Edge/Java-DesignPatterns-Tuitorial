package com.javaedge.design.pattern.behavioral.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * @author JavaEdge
 * @date 2019/1/19
 */
@Getter
@Setter
public class Course {

    /**
     * 课程名
     */
    private String name;

    /**
     * 博客
     */
    private String article;

    /**
     * 视频
     */
    private String video;
}
