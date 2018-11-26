package com.sss.design.pattern.behavioral.interpreter.std;

/**
 * 终结符表达式
 *
 * @author sss
 * @date 2018/11/26
 */
public class TerminalExpression extends Expression {
    /**
     * 通常终结符表达式只有一个，但是有多个对象
     *
     * @param ctx
     * @return
     */
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
