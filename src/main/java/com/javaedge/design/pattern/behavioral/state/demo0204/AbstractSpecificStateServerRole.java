package com.javaedge.design.pattern.behavioral.state.demo0204;

/**
 * 特定状态服务方-抽象类
 *
 * @author JavaEdge
 * @date 2022/4/20
 */
public abstract class AbstractSpecificStateServerRole implements ISpecificStateServerRole {
    protected IStateServerRole stateServerRole;

    public AbstractSpecificStateServerRole(IStateServerRole stateServerRole) {
        this.stateServerRole = stateServerRole;
    }

    @Override
    public void stateServer1() {
        //默认实现
    }

    @Override
    public void stateServer2() {
        //默认实现
    }


}
