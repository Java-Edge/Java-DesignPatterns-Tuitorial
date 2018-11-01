package com.javaedge.design.principle.singleresponsibility.bird;

import com.javaedge.design.principle.singleresponsibility.bird.FlyBird;
import com.javaedge.design.principle.singleresponsibility.bird.WalkBird;

/**
 * @author JavaEdge
 */
public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");

    }
}
