package com.javaedge.design.pattern.structural.flyweight.editor.fw;

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

    private CharacterStyle style;
}
