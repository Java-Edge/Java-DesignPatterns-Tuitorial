package com.javaedge.design.pattern.behavioral.templatemethod.game;

/**
 * @author JavaEdge
 * @date 2021/9/30
 */
public abstract class Game {

    /**
     * 初始化游戏
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();

    /**
     * 模板方法 final修饰
     */
    public final void play() {

        initialize();

        startPlay();

        endPlay();
    }
}
