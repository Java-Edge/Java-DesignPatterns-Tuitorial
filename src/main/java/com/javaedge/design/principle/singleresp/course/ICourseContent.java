package com.javaedge.design.principle.singleresp.course;

/**
 * @author JavaEdge
 */
public interface ICourseContent {

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
}
