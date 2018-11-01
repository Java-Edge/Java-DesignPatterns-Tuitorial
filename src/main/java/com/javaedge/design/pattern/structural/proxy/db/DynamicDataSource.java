package com.javaedge.design.pattern.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author JavaEdge
 * @date 2018/9/16 23:50
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * 当前线程是哪个 db
     *
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDbType();
    }

}
