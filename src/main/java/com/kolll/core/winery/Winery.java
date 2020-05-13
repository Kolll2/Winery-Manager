package com.kolll.core.winery;

import com.kolll.core.winery.vineyards.Vineyards;

import java.util.ArrayList;

public class Winery {
    String name;

    ArrayList<Vineyards> vineyards;

    public Winery(String name) {
        this.name = name;
        vineyards = new ArrayList<>();
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
