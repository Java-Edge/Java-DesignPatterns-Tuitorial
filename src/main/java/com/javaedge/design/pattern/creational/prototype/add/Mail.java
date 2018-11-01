package com.javaedge.design.pattern.creational.prototype.add;

import lombok.Getter;
import lombok.Setter;

/**
 * @fun 邮件类
 * @author JavaEdge
 * @date 2018/11/13
 */
@Getter
@Setter
public class Mail {
    /**
     * 收件人
     */
    private String receiver;
    /**
     * 邮件名称
     */
    private String subject;
    /**
     * 称谓
     */
    private String appellation;
    /**
     * 邮件内容
     */
    private String context;
    /**
     * 邮件的尾部，一般都是加上"XXX版权所有"等信息
     */
    private String tail;

    /**
     * 构造函数
     * @param advTemplate
     */
    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }
}
