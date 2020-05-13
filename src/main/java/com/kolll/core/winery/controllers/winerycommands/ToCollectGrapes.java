package com.kolll.core.winery.controllers.winerycommands;

public class ToCollectGrapes implements WineryCommand {
    @Override
    public void execute() {
        System.out.println("in collect menu");
    }
}
