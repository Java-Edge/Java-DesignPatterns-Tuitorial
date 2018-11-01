package com.javaedge.design.pattern.behavioral.visitor;

import com.javaedge.design.pattern.behavioral.observer.jdk.Teacher;

/**
 * @author JavaEdge
 * @date 2021/12/10
 */
public interface Visitor {

    <Student> void visit(Student student);

    void visit(Teacher teacher);
}
