package com.javaedge.design.pattern.structural.adapter.classadapter.v1;

/**
 * 使用 AudioPlayer 来播放不同类型的音频格式
 *
 * @author JavaEdge
 * @date 2021/7/18
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
