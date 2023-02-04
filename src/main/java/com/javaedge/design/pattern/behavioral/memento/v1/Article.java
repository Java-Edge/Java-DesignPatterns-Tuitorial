package com.javaedge.design.pattern.behavioral.memento.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author JavaEdge
 * @date 2018/11/27
 */
@Data
@ToString
@AllArgsConstructor
public class Article {

    private String title;

    private String content;

    private String imgs;

    /**
     * 保存
     *
     * @return 博客历史版本
     */
    public ArticleMemento saveToMemento() {
        return new ArticleMemento(this.title, this.content, this.imgs);
    }

    /**
     * 撤销
     *
     * @param articleMemento 博客历史版本
     */
    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.imgs = articleMemento.getImgs();
    }
}



