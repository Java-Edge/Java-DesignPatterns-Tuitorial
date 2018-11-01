package com.javaedge.design.pattern.behavioral.observer.jdk;

import lombok.Builder;
import lombok.Data;

/**
 * @author JavaEdge
 */
@Data
@Builder
public class Question {

    private String userName;

    private String questionContent;
}

