package com.sss.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().buildCPU("酷睿I7").buildMainBoard("华硕主板").build();
        System.out.println(computer);
        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();

        System.out.println(set);

    }
}
