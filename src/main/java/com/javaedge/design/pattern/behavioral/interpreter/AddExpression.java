package com.javaedge.design.pattern.behavioral.interpreter;

import java.util.HashMap;

/**
 * 加法解析器
 *
 * @author JavaEdge
 * @date 2018/11/26
 */
public class AddExpression extends BaseSymbolExpression {
    public AddExpression(Expression _left,Expression _right){
        super(_left,_right);
    }

    /**
     * 把左右两个表达式运算的结果加起来
     * @param var 变量
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
