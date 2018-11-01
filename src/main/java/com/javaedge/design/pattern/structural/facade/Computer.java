package com.javaedge.design.pattern.structural.facade;

/**
 * Created by Learner
 */
public class Computer {
    private CPU cpu;
    private Disk disk;

    public Computer(){
        this.cpu = new CPU();
        this.disk = new Disk();
    }
    public void open(){
        this.cpu.open();
        this.disk.open();
    }
    public void close(){
        this.cpu.close();
        this.disk.close();
    }

}
