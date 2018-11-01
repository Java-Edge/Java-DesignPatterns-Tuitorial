package com.javaedge.design.principle.dip.good.drive;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

/**
 * @author JavaEdge
 * @date 2021/10/13
 */
public class DriverTest {

    Mockery context = new JUnit4Mockery();

    @Test
    public void testDriver() {
        // 根据接口虚拟一个对象
        final ICar car = context.mock(ICar.class);
        IDriver driver = new Driver();
        // 内部类
        context.checking(new Expectations() {{
            oneOf(car).run();
        }});
        driver.drive(car);
    }
}