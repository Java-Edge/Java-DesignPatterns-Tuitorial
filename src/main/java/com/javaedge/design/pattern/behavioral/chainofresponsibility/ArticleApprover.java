package com.javaedge.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 批准者具体实现类
 *
 * @author JavaEdge
 * @date 2019/1/19
 */
public class ArticleApprover extends AbstractApprover {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有博客,批准");
            if (abstractApprover != null) {
                abstractApprover.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有博客,拒绝批准");
        }
    }
}
