package com.javaedge.design.pattern.structural.adapter.classadapter.v1;

/**
 * 实现了 AdvancedMediaPlayer 接口的实体类
 *
 * @author JavaEdge
 * @date 2021/7/18
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
