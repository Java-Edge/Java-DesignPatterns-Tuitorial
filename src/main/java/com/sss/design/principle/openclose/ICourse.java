package com.sss.design.principle.openclose;


/**
 * @author shishusheng
 */
public interface ICourse {

    /**
     * 课程 ID
     * @return
     */
    Integer getId();

    /**
     * 课程名
     * @return
     */
    String getName();

    /**
     * 课程价钱
     * @return
     */
    Double getPrice();

}
