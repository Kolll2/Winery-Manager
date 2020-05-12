package com.kolll.core.winery;

public class Winery {
    String name;

    public Winery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Winery{" +
                "name='" + name + '\'' +
                '}';
    }
}
