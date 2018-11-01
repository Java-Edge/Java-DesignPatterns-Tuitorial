package com.javaedge.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * 【具体实现类】审批人
 *
 * @author JavaEdge
 */
public class VideoApprover extends BaseApprover {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含视频,批准!");
            if (Objects.nonNull(nextApprover)) {
                nextApprover.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含视频,拒绝!");
        }
    }
}

