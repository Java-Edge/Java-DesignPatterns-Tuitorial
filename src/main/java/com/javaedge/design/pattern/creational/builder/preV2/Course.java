package com.javaedge.design.pattern.creational.builder.preV2;

import lombok.Data;
import lombok.ToString;

/**
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

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.courseName = courseBuilder.courseName;
        this.courseName = courseBuilder.courseName;
        this.courseName = courseBuilder.courseName;
        this.courseName = courseBuilder.courseName;
    }

    public static class CourseBuilder {

        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;


        public CourseBuilder(CourseBuilder courseBuilder) {
            this.courseName = courseName;
            this.coursePPT = coursePPT;
            this.courseVideo = courseVideo;
            this.courseArticle = courseArticle;
            this.courseQA = courseQA;

        }

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
