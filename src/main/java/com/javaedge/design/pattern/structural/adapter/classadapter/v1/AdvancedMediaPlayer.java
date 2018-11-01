package com.javaedge.design.pattern.structural.adapter.classadapter.v1;

/**
 * 更高级的媒体播放器
 *
 * @author JavaEdge
 * @date 2021/7/18
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放 Vlc
     *
     * @param fileName 文件名
     */
    void playVlc(String fileName);

    /**
     * 播放 Mp4
     *
     * @param fileName 文件名
     */
    void playMp4(String fileName);
}
