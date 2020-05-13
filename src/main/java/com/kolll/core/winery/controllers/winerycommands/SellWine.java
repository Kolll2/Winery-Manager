package com.kolll.core.winery.controllers.winerycommands;

public class SellWine implements WineryCommand {
    @Override
    public void execute() {
        System.out.println("in sell wine menu");
    }
}
