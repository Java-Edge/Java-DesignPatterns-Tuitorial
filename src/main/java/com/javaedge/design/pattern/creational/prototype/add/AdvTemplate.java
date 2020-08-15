package com.javaedge.design.pattern.creational.prototype.add;

/**
 * @fun 广告信模板
 * @author JavaEdge
 * @date 2018/11/13
 */
public class AdvTemplate {
    /**
     * 广告信名称
     */
    private String advSubject ="XX银行国庆信用卡抽奖活动";
    /**
     * 广告信内容
     */
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万！...";

    /**
     * 取得广告信的名称
     * @return
     */
    public String getAdvSubject(){
        return this.advSubject;
    }

    /**
     * 取得广告信的内容
     * @return
     */
    public String getAdvContext(){
        return this.advContext;
    }
}
