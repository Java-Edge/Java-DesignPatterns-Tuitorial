package com.javaedge.design.pattern.behavioral.state.demo0204;

/**
 * 测试类
 *
 * @author JavaEdge
 * @date 2022/4/20
 */
public class TestStateClientRole {

    public static void main(String[] args) {
        TestStateClientRole testStateClientRole = new TestStateClientRole();
        testStateClientRole.testStateServer01();
    }

    public void testStateServer01() {
        StateClientRole stateClientRole = new StateClientRole();
        stateClientRole.clientMethod();
    }
}
