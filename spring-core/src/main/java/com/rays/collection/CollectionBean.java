package com.rays.collection;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CollectionBean {

    private List<String> list;

    private Map<String, String> map;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void displayData() {
        System.out.println("List elements are:" + list);
        System.out.println("Map enteries are:" + map);
    }
}
