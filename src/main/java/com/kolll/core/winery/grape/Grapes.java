package com.kolll.core.winery.grape;

import com.kolll.core.winery.grape.characteristics.*;

import java.util.TreeSet;

public abstract class Grapes implements Grape {
    public GrapeColor colorType;
    public GrapeAcidity acidity;
    public GrapeBody body;
    public GrapeAlcohol alcohol;
    public TreeSet<Aromas> aromas;
}
