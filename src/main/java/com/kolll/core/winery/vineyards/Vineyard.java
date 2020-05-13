package com.kolll.core.winery.vineyards;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class Vineyard implements Vineyards {
    Long area;

    public Vineyard(Long area) {
        this.area = area;
    }

    private void addArea (Long difference){
        area += difference;
    }

    private void reduceArea (Long difference){
        area-= difference;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }
}
