package com.javaedge.design.pattern.creational.prototype.clone;

import com.javaedge.design.pattern.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @date 2019.1.16 9:32
 * @author JavaEdge
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("佩奇",birthday);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig2);
//
//        pig1.getBirthday().setTime(666666666666L);
//
//        System.out.println(pig1);
//        System.out.println(pig2);

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);

        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}



