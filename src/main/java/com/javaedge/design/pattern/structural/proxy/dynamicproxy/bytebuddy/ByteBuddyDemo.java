package com.javaedge.design.pattern.structural.proxy.dynamicproxy.bytebuddy;

import com.javaedge.design.pattern.creational.singleton.T;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;

/**
 * @author apple
 * @date 2023/2/4
 */
public class ByteBuddyDemo {

    public static void main(String[] args) {

//        Class<? extends T> clazz = ByteBuddy.subclass(clz)
//                .method(ElementMatchers.isDeclaredBy(clz))
//                .intercept(MethodDelegation.to(new ByteBuddyInvocationHandler(invoker)))
//                .make()
//                .load(classLoader, ClassLoadingStrategy.Default.INJECTION)
//                .getLoaded();
//        try {
//            return clazz.newInstance();
//        } catch (Exception e) {
//        }
    }
}
