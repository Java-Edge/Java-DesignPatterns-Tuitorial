package com.sss.design.pattern.creational.factory;

/**
 * @fun 黄色人种
 * @author sss
 * @date 2018/11/1
 */
public class YellowHuman implements Human {

    @Override
    public void getColor(){
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}
