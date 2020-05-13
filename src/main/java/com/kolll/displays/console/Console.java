package com.kolll.displays.console;

import com.kolll.displays.Display;
import com.kolll.world.World;

import java.time.LocalDate;
import java.time.Month;

public class Console implements Display {

    World world;

    //test value
    long money = 2576;

    public Console(World world) {
        this.world = world;
    }

    @Override
    public void draw() {

        System.out.println(" Money: " + money + "\t Date: " + world.getGameDate().toString());

    }

    @Override
    public void update() {
        draw();

    }
}
