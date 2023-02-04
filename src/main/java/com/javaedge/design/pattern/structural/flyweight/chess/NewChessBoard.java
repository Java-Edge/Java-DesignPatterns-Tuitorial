package com.javaedge.design.pattern.structural.flyweight.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * 棋局
 *
 * @author JavaEdge
 * @date 2022/5/28
 */
public class NewChessBoard {

    private Map<Integer, NewChessPiece> chessPieces = new HashMap<>();

    public NewChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new NewChessPiece(
                ChessPieceUnitFactory.getChessPiece(1), 0, 0));
        chessPieces.put(1, new NewChessPiece(
                ChessPieceUnitFactory.getChessPiece(2), 1, 0));
        //...摆放其他棋子
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        //...
    }
}
