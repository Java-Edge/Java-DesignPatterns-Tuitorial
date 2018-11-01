package com.javaedge.design.pattern.behavioral.templatemethod.game;

/**
 * 扩展了Game类的实体类
 * @author JavaEdge
 * @date 2021/9/30
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
