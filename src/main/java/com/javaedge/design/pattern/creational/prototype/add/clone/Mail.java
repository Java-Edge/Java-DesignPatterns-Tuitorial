package com.javaedge.design.pattern.creational.prototype.add.clone;

import com.javaedge.design.pattern.creational.prototype.add.AdvTemplate;
import lombok.Getter;
import lombok.Setter;

/**
 * @author JavaEdge
 * @date 2018/11/13
 */
@Setter
@Getter
public class Mail implements Cloneable{
    private String receiver;
    private String subject;
    private String appellation;
    private String context;
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }
    @Override
    public Mail clone(){
        Mail mail =null;
        try {
            mail = (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mail;
    }

}
