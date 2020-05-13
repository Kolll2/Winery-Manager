package com.kolll.core.winery.controllers.winerycommands;

public class ToMakeWine implements WineryCommand {
    @Override
    public void execute() {
        System.out.println("in make wine menu");
    }
}
