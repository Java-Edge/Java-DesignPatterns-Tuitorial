package com.javaedge.design.pattern.behavioral.templatemethod;


public class FECourse extends ACourse {

    private boolean needWriteArticleFlag;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体资源");
    }


    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return super.needWriteArticle();
    }
}
