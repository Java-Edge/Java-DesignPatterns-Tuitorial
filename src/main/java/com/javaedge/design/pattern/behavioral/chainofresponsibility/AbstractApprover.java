package com.javaedge.design.pattern.behavioral.chainofresponsibility;

/**
 * 批准者
 *
 * @author JavaEdge
 * @date 2019/1/19
 */
public abstract class AbstractApprover {

    protected AbstractApprover abstractApprover;

    public void setNextApprover(AbstractApprover abstractApprover) {
        this.abstractApprover = abstractApprover;
    }

    /**
     * 发布
     *
     * @param course 课程
     */
    public abstract void deploy(Course course) ;
}
