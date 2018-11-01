package com.javaedge.design.principle.singleresp.bird;

/**
 * @author JavaEdge
 */
public class Test {
    public static void main(String[] args) {
//        Test bird = new Test();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");

    }
}
