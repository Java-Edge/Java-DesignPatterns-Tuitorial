package com.javaedge.design.principle.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * @author JavaEdge
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        JavaBook baseCourse = new JavaBook(66, "Java编程思想", 98d);

        JavaDiscountBook discountBook = (JavaDiscountBook) baseCourse;
        log.info("书籍ID:" + discountBook.getId() +
                " 书籍名称:" + discountBook.getName() +
                " 书籍原价:" + discountBook.getPrice() +
                "书籍优惠价:" + discountBook.getDiscountPrice());
    }
}

