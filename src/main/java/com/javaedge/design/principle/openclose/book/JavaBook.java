package com.javaedge.design.principle.openclose.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Java书籍实现类
 *
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
