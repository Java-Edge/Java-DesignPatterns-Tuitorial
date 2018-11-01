package com.javaedge.design.pattern.behavioral.interpreter;

import java.util.HashMap;

/**
 * 抽象表达式类
 *
 * @author JavaEdge
 * @date 2018/11/26
 */
public abstract class Expression {
    /**
     * 解析公式和数值，其中var中的key值是公式中的参数，value值是具体的数字
     *
     * @param var 变量
     * @return
     */
    public abstract int interpreter(HashMap<String,Integer> var);
}
