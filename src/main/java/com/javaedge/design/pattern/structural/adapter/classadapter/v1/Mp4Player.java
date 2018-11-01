package com.javaedge.design.pattern.structural.adapter.classadapter.v1;

/**
 * 实现了 AdvancedMediaPlayer 接口的实体类
 *
 * @author JavaEdge
 * @date 2021/7/18
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
