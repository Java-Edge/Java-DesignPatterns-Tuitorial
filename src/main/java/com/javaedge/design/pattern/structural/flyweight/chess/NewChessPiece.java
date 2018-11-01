package com.javaedge.design.pattern.structural.flyweight.chess;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author JavaEdge
 * @date 2022/5/28
 */
@AllArgsConstructor
@Data
public class NewChessPiece {

    private ChessPieceUnit chessPieceUnit;

    private int positionX;

    private int positionY;
}
