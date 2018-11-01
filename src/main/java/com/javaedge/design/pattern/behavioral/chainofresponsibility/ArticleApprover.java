package com.javaedge.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 【具体实现类】审批人
 *
 * @author JavaEdge
 */
public class ArticleApprover extends BaseApprover {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneBlank(course.getArticle())) {
            System.out.println(course.getName() + "含博客,批准!");
            if (nextApprover != null) {
                nextApprover.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含博客,拒绝!");
        }
    }
}
