package com.sss.design.principle.singleresponsibility;

/**
 * @author shishusheng
 */
public interface ICourse {
    // 一类职责

    /**
     * 获取课程名
     *
     * @return
     */
    String getCourseName();

    /**
     * 获取课程视频
     *
     * @return
     */
    byte[] getCourseVideo();

    //二类职责

    /**
     * 学习课程
     */
    void studyCourse();

    /**
     * 退出课程
     */
    void refundCourse();

}
