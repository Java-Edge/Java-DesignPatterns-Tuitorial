package com.javaedge.design.pattern.structural.flyweight.editor.old;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;

/**
 * 文字
 *
 * @author JavaEdge
 * @date 2022/5/28
 */
@AllArgsConstructor
@Data
public class Character {

    private char c;

    private Font font;

    private int size;

    private int colorRGB;
}
