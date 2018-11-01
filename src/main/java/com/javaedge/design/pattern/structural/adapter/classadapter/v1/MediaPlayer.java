package com.javaedge.design.pattern.structural.adapter.classadapter.v1;

/**
 * 媒体播放器
 *
 * @author JavaEdge
 * @date 2021/7/18
 */
public interface MediaPlayer {

    /**
     * 播放
     *
     * @param audioType 音频类型
     * @param fileName 文件名
     */
    void play(String audioType, String fileName);
}
