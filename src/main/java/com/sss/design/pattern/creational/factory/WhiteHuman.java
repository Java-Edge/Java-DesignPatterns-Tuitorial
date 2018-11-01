package com.sss.design.pattern.creational.factory;

/**
 * @fun 白色人种
 * @author sss
 * @date 2018/11/1
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor(){
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般都是但是单字节。");
    }
}
