package com.sss.design.pattern.structural.proxy.db;


/**
 * @author shishusheng
 * @date 2018/9/16 23:51
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setDbType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String  getDbType() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDbType() {
        CONTEXT_HOLDER.remove();
    }

}
