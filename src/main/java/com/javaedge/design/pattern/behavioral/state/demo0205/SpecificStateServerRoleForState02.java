package com.javaedge.design.pattern.behavioral.state.demo0205;

import com.javaedge.design.pattern.behavioral.state.demo0204.IStateServerRole;

/**
 * 状态01对应的特定状态服务方对象
 *
 * @author JavaEdge
 * @date 2022/4/27
 */
public class SpecificStateServerRoleForState02 extends AbstractSpecificStateServerRole {

    public SpecificStateServerRoleForState02(IStateServerRole stateServerRole, StateServer4Helper stateServer4Helper) {
        super(stateServerRole, stateServer4Helper);
    }

    @Override
    public void stateServer4() {
        stateServer4Helper.stateServer4ForBiz02();
    }

}
