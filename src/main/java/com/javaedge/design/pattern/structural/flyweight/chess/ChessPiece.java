package com.javaedge.design.pattern.structural.flyweight.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 棋子
 *
 * @author JavaEdge
 * @date 2022/5/28
 */
@AllArgsConstructor
@Getter
@Setter
public class ChessPiece {

    private int id;

    private String text;

    private Color color;

    private int positionX;

    private int positionY;

    public static enum Color {
        RED, BLACK
    }
}
