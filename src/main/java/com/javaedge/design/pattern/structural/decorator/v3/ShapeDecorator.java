package com.javaedge.design.pattern.structural.decorator.v3;

/**
 * @author JavaEdge
 * @date 2021/5/31
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
