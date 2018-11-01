package com.sss.design.pattern.creational.builder;

/**
 * Created by geely
 */
public class DirectorBoss {


    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(String cpu,String mainBoard,
                                   String hardDisk,String displayCard,
                                   String power,String memory){
        this.builder.buildCPU(cpu);
        this.builder.buildMainBoard(mainBoard);
        this.builder.buildHardDisk(hardDisk);
        this.builder.buildDisplayCard(displayCard);
        this.builder.buildPower(power);
        this.builder.buildMemory(memory);
        return this.builder.createComputer();
    }

}
