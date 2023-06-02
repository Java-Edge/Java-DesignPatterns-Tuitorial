package com.javaedge.design.principle.singleresp.course;

/**
 * @author JavaEdge
 */
public interface ICourse {

    // 一类职责
    /**
     * 获取课程名
     *
     * @return 课程名
     */
    String getCourseName();

    /**
     * 获取课程视频
     *
     * @return 课程视频
     */
    byte[] getCourseVideo();

    // 二类职责
    /**
     * 学习课程
     */
    void studyCourse();

    /**
     * 退出课程
     */
    void refundCourse();

}
