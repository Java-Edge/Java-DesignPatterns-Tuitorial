package com.javaedge.design.principle.openclose;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author JavaEdge
 */
@AllArgsConstructor
@Getter
public class JavaBook implements BaseBook {

    private Integer id;

    private String name;

    private Double price;
}
