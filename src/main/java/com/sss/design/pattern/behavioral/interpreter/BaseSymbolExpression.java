package com.sss.design.pattern.behavioral.interpreter;

/**
 * 抽象运算符号解析器
 *
 * @author sss
 * @date 2018/11/26
 */
public abstract class BaseSymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     *
     * @param _left
     * @param _right
     */
    public BaseSymbolExpression(Expression _left, Expression _right){
        this.left = _left;
        this.right = _right;
    }
}
