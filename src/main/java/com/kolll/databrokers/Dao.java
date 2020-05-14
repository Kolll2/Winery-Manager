package com.kolll.databrokers;

import com.kolll.core.winery.vineyards.Vineyards;

import java.util.ArrayList;

public interface Dao {

    boolean addNewVineyard(Vineyards newVineyard);

    ArrayList<Vineyards> getAllVineyard();
}
