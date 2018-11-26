package com.sss.design.pattern.behavioral.interpreter.std;

/**
 * @author sss
 * @date 2018/11/26
 */
public class NonterminalExpression extends Expression {
    /**
     * /每个非终结符表达式都会对其他表达式产生依赖
     *
     * @param expression
     */
    public NonterminalExpression(Expression... expression){
    }

    @Override
    public Object interpreter(Context ctx) {
        //进行文法处理
        return null;
    }
}

