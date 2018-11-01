package com.javaedge.design.principle.openclose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author JavaEdge
 */
@AllArgsConstructor
@Getter
@Setter
public class JavaBook implements BaseBook {

    private Integer id;

    private String name;

    private Double price;
}
