package com.kolll.core.winery.controllers.winerycommands;

import com.kolll.world.World;

public class NextTurn implements WineryCommand {
    World world;
    public NextTurn(World world) {
        this.world = world;
    }

    @Override
    public void execute() {
        System.out.println("next turn");
        world.setGameDate(world.getGameDate().plusDays(1));
    }
}
