package com.sss.design.pattern.behavioral.memento;

import lombok.Data;
import lombok.ToString;

/**
 * @author sss
 * @date 2018/11/27
 */
@Data
@ToString
public class Article {

    private String title;
    private String content;
    private String imgs;

    public Article(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    /**
     * 保存
     *
     * @return 博客历史版本
     */
    public ArticleMemento saveToMemento() {
        ArticleMemento articleMemento = new ArticleMemento(this.title,this.content,this.imgs);
        return articleMemento;
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



