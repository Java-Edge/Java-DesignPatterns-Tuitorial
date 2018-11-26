package com.sss.design.pattern.behavioral.interpreter;

import java.util.HashMap;

/**
 * 减法解析器
 *
 * @author sss
 * @date 2018/11/26
 */
public class SubExpression extends BaseSymbolExpression {
    public SubExpression(Expression _left,Expression _right){
        super(_left,_right);
    }

    /**
     * 左右两个表达式相减
     *
     * @param var 变量
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
