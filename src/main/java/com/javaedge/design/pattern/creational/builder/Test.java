package com.javaedge.design.pattern.creational.builder;

/**
 * @author JavaEdge
 */
public class Test {
    public static void main(String[] args) {



        Builder builder = new ActualBuilder();
        DirectorBoss directorBoss = new DirectorBoss();
        directorBoss.setBuilder(builder);

        Computer computer = directorBoss.createComputer("酷睿I7","华硕主板","希捷2T硬盘","英伟达显卡","长城电源","威刚内存条8G");

        System.out.println(computer);

    }
}
