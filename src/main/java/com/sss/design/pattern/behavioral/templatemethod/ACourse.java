package com.sss.design.pattern.behavioral.templatemethod;

public abstract class ACourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVedio();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作 PPT");

    }

    final void makeVedio() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    //钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();

}
