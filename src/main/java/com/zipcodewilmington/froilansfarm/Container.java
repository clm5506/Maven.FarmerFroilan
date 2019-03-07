package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Container<T> {
    private java.util.List<T> list;

    public void add(T t) {
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public int size() {
        return list.size();
    }

    public List<T> getList() {
        return list;
    }

}
