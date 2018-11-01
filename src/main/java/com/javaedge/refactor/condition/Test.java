package com.javaedge.refactor.condition;

import com.javaedge.refactor.condition.ReplaceConditionalwithPolymorphism.Bird;
import lombok.Getter;

/**
 * @author JavaEdge
 * @date 2022/4/10
 */
@Getter
public class Test {

    private Bird bird;

    public String plumages() {
        return bird.getPlumage();
    }

    public int speeds() {
        return bird.airSpeedVelocity();
    }
}
