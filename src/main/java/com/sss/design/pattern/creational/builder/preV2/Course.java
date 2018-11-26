package com.sss.design.pattern.creational.builder.preV2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author sss
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
