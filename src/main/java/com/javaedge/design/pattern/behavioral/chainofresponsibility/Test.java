package com.javaedge.design.pattern.behavioral.chainofresponsibility;

/**
 * @author JavaEdge
 */
public class Test {

    public static void main(String[] args) {
        BaseApprover articleApprover = new ArticleApprover();
        BaseApprover videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("公众号-Learner");
//        course.setArticle("JavaEdge的博客");
        course.setVideo("JavaEdge的小视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
