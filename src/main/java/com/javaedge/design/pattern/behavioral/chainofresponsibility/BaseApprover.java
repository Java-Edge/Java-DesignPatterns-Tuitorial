package com.javaedge.design.pattern.behavioral.chainofresponsibility;

/**
 * 审批人
 *
 * @author JavaEdge
 */
public abstract class BaseApprover {

    protected BaseApprover nextApprover;

    public void setNextApprover(BaseApprover baseApprover) {
        this.nextApprover = baseApprover;
    }

    /**
     * 发布
     *
     * @param course 课程
     */
    public abstract void deploy(Course course) ;
}
