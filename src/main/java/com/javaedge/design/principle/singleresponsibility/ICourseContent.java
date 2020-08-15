package com.javaedge.design.principle.singleresponsibility;

/**
 * @author JavaEdge
 */
public interface ICourseContent {

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
}
