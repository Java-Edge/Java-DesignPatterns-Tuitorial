package com.javaedge.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 批准者具体实现类
 *
 * @author JavaEdge
 * @date 2019/1/19
 */
public class VideoApprover extends AbstractApprover {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频,批准");
            // 防止空指针异常
            if (abstractApprover != null) {
                abstractApprover.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频,拒绝批准");
        }
    }
}

