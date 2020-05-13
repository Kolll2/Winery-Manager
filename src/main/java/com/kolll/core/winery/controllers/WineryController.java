package com.kolll.core.winery.controllers;

import com.kolll.core.winery.Winery;
import com.kolll.core.winery.controllers.winerycommands.*;

import java.lang.reflect.Executable;

public class WineryController {
    Winery winery;

    public WineryController(Winery winery) {
        this.winery = winery;
    }

    public void execute(String command){
        //[b]uy a new vineyard
        if (command.equals("b") || command.equals("B")){
            new BuyNewVineyard().execute();
        }
        //[s]ell a vineyards
        if (command.equals("s") || command.equals("S")){
            new SellVineyards().execute();
        }
        //[m]anage you vineyards
        if (command.equals("m") || command.equals("M")){
            new ManageYouVineyards().execute();
        }
        //[t]o collect grapes
        if (command.equals("t") || command.equals("T")){
            new ToCollectGrapes().execute();
        }
        //to make [w]ine
        if (command.equals("w") || command.equals("W")){
            new ToMakeWine().execute();
        }
        //s[e]ll wine
        if (command.equals("e") || command.equals("E")){
            new SellWine().execute();
        }
        //[n]ext turn
        if (command.equals("n") || command.equals("N")){
            new NextTurn().execute();
        }
    }
}
