package com.sss.design.principle.singleresponsibility;


/**
 * @author shishusheng
 */
public class Test {
    public static void main(String[] args) {

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");

    }
}
