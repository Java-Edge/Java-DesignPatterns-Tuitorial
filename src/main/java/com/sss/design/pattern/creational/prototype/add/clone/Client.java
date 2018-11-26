package com.sss.design.pattern.creational.prototype.add.clone;

import com.sss.design.pattern.creational.prototype.add.AdvTemplate;

import static com.sss.design.pattern.creational.prototype.add.Client.getRandString;

/**
 * @author sss
 * @date 2018/11/13
 */
public class Client {
    //发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;
    public static void main(String[] args) {
        //模拟发送邮件
        int i=0;
        //把模板定义出来，这个是从数据中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while(i<MAX_COUNT){
            //以下是每封邮件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5)+" 先生（女士）");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            //然后发送邮件
//            sendMail(cloneMail);
            i++;
        }
    }
}
