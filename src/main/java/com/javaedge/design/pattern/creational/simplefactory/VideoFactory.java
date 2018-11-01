package com.javaedge.design.pattern.creational.simplefactory;

/**
 * @author JavaEdge
 */
public class VideoFactory {

    /**
     * 获取视频实例 v1.0
     *
     * @param type 视频类型
     * @return 指定类型的视频实例
     */
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 获取视频实例 v2.0
     *
     * @param c 类型
     * @return 视频实例
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
