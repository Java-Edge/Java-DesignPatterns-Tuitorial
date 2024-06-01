package com.javaedge.design.pattern.creational.builder.pre;

import lombok.Data;
import lombok.ToString;

/**
 * 课程类
 *
 * @author JavaEdge
 * @date 2018/11/9
 */
@Data
@ToString
public class Course {

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程PPT
     */
    private String coursePPT;

    /**
     * 课程视频
     */
    private String courseVideo;

    /**
     * 课程文档
     */
    private String courseArticle;

    /**
     * 课程QA
     */
    private String courseQA;
}
