package com.javaedge.design.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程 Java 源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
