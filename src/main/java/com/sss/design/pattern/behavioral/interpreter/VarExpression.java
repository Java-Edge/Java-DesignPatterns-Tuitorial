package com.sss.design.pattern.behavioral.interpreter;

import java.util.HashMap;

/**
 * 变量解析器
 *
 * @author sss
 * @date 2018/11/26
 */
public class VarExpression extends Expression {
    private String key;
    public VarExpression(String _key){
        this.key = _key;
    }

    /**
     * 从map中取值
     * @param var 变量
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
