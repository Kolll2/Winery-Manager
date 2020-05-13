package com.kolll;

import com.kolll.core.winery.Winery;
import com.kolll.displays.console.Console;
import com.kolll.world.World;

public class Main {
    public static void main(String[] args) {
        System.out.println("The Winery Manager has been successfully launched");
        Winery winery = new Winery("New Name");
        World world = new World(winery);
        world.startGame("step by step");
    }
}
