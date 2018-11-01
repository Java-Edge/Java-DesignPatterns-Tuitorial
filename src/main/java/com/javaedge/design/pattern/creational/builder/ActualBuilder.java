package com.javaedge.design.pattern.creational.builder;

/**
 * Created by geely
 */
public class ActualBuilder extends Builder {

    private Computer computer = new Computer();


    @Override
    public void buildCPU(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
    }

    @Override
    public void buildHardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
    }

    @Override
    public void buildDisplayCard(String displayCard) {
        computer.setDisplayCard(displayCard);
    }

    @Override
    public void buildPower(String power) {
        computer.setPower(power);
    }

    @Override
    public void buildMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
