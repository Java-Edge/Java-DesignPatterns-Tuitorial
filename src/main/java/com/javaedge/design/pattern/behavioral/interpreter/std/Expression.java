package com.javaedge.design.pattern.behavioral.interpreter.std;

/**
 * @author JavaEdge
 * @date 2018/11/26
 */
public abstract class Expression {
    /**
     * 每个表达式必须有一个解析任务
     *
     * @param ctx
     * @return
     */
    public abstract Object interpreter(Context ctx);
}
