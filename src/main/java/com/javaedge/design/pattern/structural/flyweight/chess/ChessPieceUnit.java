package com.javaedge.design.pattern.structural.flyweight.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 享元类
 *
 * @author JavaEdge
 * @date 2022/5/28
 */
@AllArgsConstructor
@Getter
public class ChessPieceUnit {

    private int id;

    private String text;

    private Color color;

    public static enum Color {
        RED, BLACK
    }
}
