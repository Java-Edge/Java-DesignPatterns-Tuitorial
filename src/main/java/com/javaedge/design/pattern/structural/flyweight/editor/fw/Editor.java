package com.javaedge.design.pattern.structural.flyweight.editor.fw;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JavaEdge
 * @date 2022/5/28
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        chars.add(character);
    }
}
