package com.kolll.core.winery.controllers.winerycommands;

public class NextTurn implements WineryCommand {
    @Override
    public void execute() {
        System.out.println("next turn");
    }
}
