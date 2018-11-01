package com.sss.design;

import java.util.List;

class Box<T> {

    private List<T> item;

    public List<T> get() {
        return item;
    }

    public void set(List<T> t) {
        item = t;
    }

    //helper()函数辅助getSet()方法存取元素
    public void getSet(Box<?> box) {
        helper(box);
    }

    public <V> void helper(Box<V> box) {
        box.set(box.get());
    }
}

