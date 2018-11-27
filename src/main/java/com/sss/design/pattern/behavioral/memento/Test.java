package com.sss.design.pattern.behavioral.memento;

/**
 * @author sss
 * @date 2018/11/27
 */
public class Test {

    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article= new Article("如影随行的设计模式A","博客内容A","博客图片A");

        ArticleMemento articleMemento = article.saveToMemento();

        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题:"+article.getTitle()+" 内容:"+article.getContent()+" 图片:"+article.getImgs()+" 暂存成功");

        System.out.println("博客完整信息:"+article);


        System.out.println("修改博客start");

        article.setTitle("如影随行的设计模式B");
        article.setContent("博客内容B");
        article.setImgs("博客图片B");

        System.out.println("修改博客end");

        System.out.println("博客完整信息:"+article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("如影随行的设计模式C");
        article.setContent("博客内容C");
        article.setImgs("博客图片C");

        System.out.println("暂存回退start");

        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退end");
        System.out.println("博客完整信息:"+article);

    }
}

