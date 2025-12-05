package com.javaedge.design.pattern.structural.flyweight.chess;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 享元模式象棋示例测试类
 *
 * @author JavaEdge
 */
public class FlyweightChessTest {

    @Test
    public void testChessPieceFlyweight() {
        // 创建两个"车"棋子
        NewChessPiece piece1 = new NewChessPiece(
            ChessPieceUnitFactory.getChessPiece(1),
            0,
            0
        );
        NewChessPiece piece2 = new NewChessPiece(
            ChessPieceUnitFactory.getChessPiece(1),
            9,
            0
        );

        // 验证两个棋子的ChessPieceUnit是同一个对象（享元）
        assertSame(piece1.getChessPieceUnit(), piece2.getChessPieceUnit());

        // 验证两个棋子的位置不同（外部状态）
        assertNotEquals(piece1.getPositionX(), piece2.getPositionX());
        assertEquals(piece1.getPositionY(), piece2.getPositionY());

        // 验证棋子的内部状态
        assertEquals("車", piece1.getChessPieceUnit().getText());
        assertEquals(ChessPiece.Color.RED, piece1.getChessPieceUnit().getColor());
    }

    @Test
    public void testDifferentChessPieces() {
        // 创建不同类型的棋子
        NewChessPiece rook = new NewChessPiece(
            ChessPieceUnitFactory.getChessPiece(1),  // 车
            0,
            0
        );
        NewChessPiece knight = new NewChessPiece(
            ChessPieceUnitFactory.getChessPiece(2),  // 马
            1,
            0
        );

        // 验证不同类型棋子的ChessPieceUnit是不同对象
        assertNotSame(rook.getChessPieceUnit(), knight.getChessPieceUnit());

        // 验证不同类型棋子的属性
        assertEquals("車", rook.getChessPieceUnit().getText());
        assertEquals("馬", knight.getChessPieceUnit().getText());
    }

    @Test
    public void testMemoryUsage() {
        // 创建多个相同类型的棋子，验证内存使用
        NewChessPiece[] pieces = new NewChessPiece[4];
        for (int i = 0; i < 4; i++) {
            pieces[i] = new NewChessPiece(
                ChessPieceUnitFactory.getChessPiece(1),  // 都是"车"
                i,
                0
            );
        }

        // 验证所有棋子共享同一个ChessPieceUnit对象
        for (int i = 1; i < pieces.length; i++) {
            assertSame(pieces[0].getChessPieceUnit(), pieces[i].getChessPieceUnit());
        }
    }
}
