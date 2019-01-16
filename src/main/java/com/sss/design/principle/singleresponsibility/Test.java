package com.sss.design.principle.singleresponsibility;

/**
 * @author shishusheng
 */
public class Test {
    public static void main(String[] args) {

//        V1.0
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");

        //=============== 单一原则 - 每个类职责单一 ==================

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");

    }
}
