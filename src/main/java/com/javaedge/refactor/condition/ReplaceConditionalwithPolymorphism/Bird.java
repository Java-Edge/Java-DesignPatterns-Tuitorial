package com.javaedge.refactor.condition.ReplaceConditionalwithPolymorphism;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author JavaEdge
 * @date 2022/4/10
 */
@Getter
@NoArgsConstructor
public class Bird {

    private Objects plumages;
    private String name;
    private String type;
    private int numberOfCoconuts;
    private boolean isNailed;
    private int voltage;

    public Bird(Bird bird) {
    }

    public String getPlumage() {
        return "unknown";
    }

    public Integer airSpeedVelocity() {
        return null;
    }

    public String plumage(Bird bird) {
        return createBird(bird).getPlumage();
    }

    public Integer airSpeedVelocity(Bird bird) {
        return createBird(bird).airSpeedVelocity();
    }

    public Bird createBird(Bird bird) {
        switch (bird.type) {
            case "EuropeanSwallow":
                return new EuropeanSwallow(bird);
            case "AfricanSwallow":
                return new AfricanSwallow(bird);
            case "NorwegianBlueParrot":
                return new NorwegianBlueParrot(bird);
            default:
                return new Bird(bird);
        }
    }


}

class EuropeanSwallow extends Bird {
    public EuropeanSwallow(Bird bird) {
    }

    @Override
    public String getPlumage() {
        return "average";
    }

    @Override
    public Integer airSpeedVelocity() {
        return 35;
    }
}

class AfricanSwallow extends Bird {
    private int numberOfCoconuts;

    public AfricanSwallow(Bird bird) {

    }

    @Override
    public String getPlumage() {
        return (this.numberOfCoconuts > 2) ? "tired" : "average";
    }

    @Override
    public Integer airSpeedVelocity() {
        return 40 - 2 * this.numberOfCoconuts;
    }
}

class NorwegianBlueParrot extends Bird {
    private int voltage;
    private boolean isNailed;

    public NorwegianBlueParrot(Bird bird) {

    }

    @Override
    public String getPlumage() {
        return (this.voltage > 100) ? "scorched" : "beautiful";
    }

    @Override
    public Integer airSpeedVelocity() {
        return (this.isNailed) ? 0 : 10 + this.voltage / 10;
    }
}
