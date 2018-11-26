package com.sss.design.pattern.creational.simplefactory;

/**
 * @author sss
 */
public class VideoFactory {

    /**
     * 获取视频实例 v1.0
     *
     * @param type 视频类型
     * @return
     */
    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 获取视频实例 v2.0
     * @param c
     * @return
     */
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
