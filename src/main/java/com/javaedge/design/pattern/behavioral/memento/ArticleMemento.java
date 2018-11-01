package com.javaedge.design.pattern.behavioral.memento;

import lombok.Getter;
import lombok.ToString;

/**
 * @author JavaEdge
 * @date 2018/11/27
 */
@Getter
@ToString
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

}

