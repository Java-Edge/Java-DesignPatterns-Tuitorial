package com.sss.design.pattern.creational.builder.v2;

/**
 * Created by geely
 */
public class Computer {

    private String cpu;
    private String mainBoard;
    private String hardDisk;
    private String displayCard;
    private String power;
    private String memory;

    public Computer(ComputerBuilder computerBuilder){
        this.cpu = computerBuilder.cpu;
        this.mainBoard = computerBuilder.mainBoard;
        this.hardDisk = computerBuilder.hardDisk;
        this.displayCard = computerBuilder.displayCard;
        this.power = computerBuilder.power;
        this.memory = computerBuilder.memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", displayCard='" + displayCard + '\'' +
                ", power='" + power + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }

    public static class ComputerBuilder{

        private String cpu;
        private String mainBoard;
        private String hardDisk;
        private String displayCard;
        private String power;
        private String memory;

        public ComputerBuilder buildCPU(String cpu){
            this.cpu = cpu;
            return this;
        }
        public ComputerBuilder buildMainBoard(String mainBoard){
            this.mainBoard = mainBoard;
            return this;
        }
        public ComputerBuilder buildHardDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }
        public ComputerBuilder buildDisplayCard(String displayCard){
            this.displayCard = displayCard;
            return this;
        }
        public ComputerBuilder buildPower(String power){
            this.power = power;
            return this;
        }
        public ComputerBuilder buildMemory(String memory){
            this.memory = memory;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }

    }

}
