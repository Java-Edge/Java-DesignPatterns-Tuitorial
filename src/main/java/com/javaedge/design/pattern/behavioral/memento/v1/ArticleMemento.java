package com.javaedge.design.pattern.behavioral.memento.v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author JavaEdge
 * @date 2018/11/27
 */
@Getter
@ToString
@AllArgsConstructor
public class ArticleMemento {

    private String title;

    private String content;

    private String imgs;
}

