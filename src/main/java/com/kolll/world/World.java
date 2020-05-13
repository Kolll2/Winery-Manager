package com.kolll.world;

import com.kolll.displays.Display;
import lombok.SneakyThrows;

public class World {
    Display display;

    public World(Display display) {
        this.display = display;
        display.draw();
    }

    @SneakyThrows
    private void gameLoop(){
        while (true) {
            display.update();
            Thread.sleep(500);
        }
    }

    public void startGame() {
        gameLoop();
    }
}
