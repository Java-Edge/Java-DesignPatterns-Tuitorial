package com.sss.design.pattern.creational.factory;

/**
 * @fun 人类创建工厂
 * @author sss
 * @date 2018/11/1
 */
public class HumanFactory<T> extends AbstractHumanFactory<T> {

    @Override
    public  T createHuman(Class c){
        //定义一个生产的人种
        Human human=null;
        try {
            //产生一个人种
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
