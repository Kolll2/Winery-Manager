package com.kolll.core.winery.controllers;

import com.kolll.core.winery.Winery;

import java.lang.reflect.Executable;

public class WineryController {
    Winery winery;

    public WineryController(Winery winery) {
        this.winery = winery;
    }

    public void execute(String command){
        //[b]uy a new vineyard
        if (command.equals("b") || command.equals("B")){
            System.out.println("in buy vineyards menu");
        }
        //[s]ell a vineyards
        if (command.equals("s") || command.equals("S")){
            System.out.println("in sell vineyards menu");
        }
        //[m]anage you vineyards
        if (command.equals("m") || command.equals("M")){
            System.out.println("in manage menu");
        }
        //[t]o collect grapes
        if (command.equals("t") || command.equals("T")){
            System.out.println("in collect menu");
        }
        //to make [w]ine
        if (command.equals("w") || command.equals("W")){
            System.out.println("in make wine menu");
        }
        //s[e]ll wine
        if (command.equals("e") || command.equals("E")){
            System.out.println("in sell wine menu");
        }
        //[n]ext turn
        if (command.equals("n") || command.equals("N")){
            System.out.println("next turn");
        }
    }
}
