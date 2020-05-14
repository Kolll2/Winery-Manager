package com.kolll.core.winery.vineyards;


import com.kolll.core.winery.grape.Grapes;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class Vineyard implements Vineyards {
    Long area;
    Grapes grape;
    String landingDensity;

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

    public Grapes getGrape() {
        return grape;
    }

    public void setGrape(Grapes grape) {
        this.grape = grape;
    }

    public String getLandingDensity() {
        return landingDensity;
    }

    public void setLandingDensity(String landingDensity) {
        this.landingDensity = landingDensity;
    }

    @Override
    public String toString() {
        return "Vineyard{" +
                "area=" + area +
                ", grape=" + grape +
                ", landingDensity='" + landingDensity + '\'' +
                '}';
    }
}
