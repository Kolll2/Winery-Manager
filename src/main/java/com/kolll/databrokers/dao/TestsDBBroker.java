package com.kolll.databrokers.dao;

import com.kolll.core.winery.vineyards.Vineyards;
import com.kolll.databrokers.Dao;

import java.util.ArrayList;

public class TestsDBBroker {

    static String wineryName;

    static ArrayList<Vineyards> vineyards = new ArrayList<>();

    public TestsDBBroker() {
    }


    public static boolean addNewVineyard(Vineyards newVineyard) {
        vineyards.add(newVineyard);
        return true;
    }


    public static ArrayList<Vineyards> getAllVineyard() {
        return vineyards;
    }

    public static String getWineryName() {
        return wineryName;
    }

    public static void setWineryName(String wineryName) {
        TestsDBBroker.wineryName = wineryName;
    }
}
