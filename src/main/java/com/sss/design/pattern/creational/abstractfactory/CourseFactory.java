package com.sss.design.pattern.creational.abstractfactory;

/**
 * @author sss
 */
public interface CourseFactory {

    /**
     * 获取视频
     *
     * @return
     */
    Video getVideo();

    /**
     * 获取博客
     *
     * @return
     */
    Article getArticle();
}
