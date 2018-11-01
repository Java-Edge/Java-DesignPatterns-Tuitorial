package com.javaedge.design.pattern.behavioral.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解析器封装类
 *
 * @author JavaEdge
 * @date 2018/11/26
 */
public class Calculator {
    /**
     * 定义表达式
     */
    private Expression expression;

    /**
     * 构造函数传参，并解析
     *
     * @param expStr
     */
    public Calculator(String expStr){
        //定义一个栈，安排运算的先后顺序
        Stack stack = new Stack();
        //表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();
        //运算
        Expression left, right;
        for(int i=0;i<charArray.length;i++){
            switch(charArray[i])     {
                //加法
                case '+':
                    //加法结果放到栈中
                    left = (Expression) stack.pop();
                    right=new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = (Expression) stack.pop();
                    right=new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:  //公式中的变量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        //把运算结果抛出来
        this.expression = (Expression) stack.pop();
    }

    /**
     * 开始运算
     *
     * @param var
     * @return
     */
    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
