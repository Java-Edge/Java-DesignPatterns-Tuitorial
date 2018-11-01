package com.javaedge.design.pattern.behavioral.templatemethod.game;

/**
 * 演示游戏的定义方式
 *
 * @author JavaEdge
 * @date 2021/9/30
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
