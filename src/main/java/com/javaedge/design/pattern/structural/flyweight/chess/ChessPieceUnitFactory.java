package com.javaedge.design.pattern.structural.flyweight.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JavaEdge
 * @date 2022/5/28
 */
public class ChessPieceUnitFactory {

    private static final Map<Integer, ChessPieceUnit> PIECES = new HashMap<>();

    static {
        PIECES.put(1, new ChessPieceUnit(1, "車", ChessPieceUnit.Color.BLACK));
        PIECES.put(2, new ChessPieceUnit(2, "馬", ChessPieceUnit.Color.BLACK));
        //...省略摆放其他棋子的代码...
    }

    public static ChessPieceUnit getChessPiece(int chessPieceId) {
        return PIECES.get(chessPieceId);
    }
}
