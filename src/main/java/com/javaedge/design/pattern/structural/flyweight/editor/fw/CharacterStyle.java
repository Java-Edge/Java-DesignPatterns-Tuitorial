package com.javaedge.design.pattern.structural.flyweight.editor.fw;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class CharacterStyle {

    private Font font;

    private int size;

    private int colorRGB;

    @Override
    public boolean equals(Object o) {
        CharacterStyle otherStyle = (CharacterStyle) o;
        return font.equals(otherStyle.font)
                && size == otherStyle.size
                && colorRGB == otherStyle.colorRGB;
    }
}
