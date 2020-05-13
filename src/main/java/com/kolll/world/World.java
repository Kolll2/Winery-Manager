package com.kolll.world;

import com.kolll.core.winery.Winery;
import com.kolll.core.winery.controllers.WineryController;
import com.kolll.displays.Display;
import lombok.SneakyThrows;

import java.util.Scanner;

public class World {

    Display display;

    Winery winery;
    WineryController controller;


    public World(Display display, Winery winery) {
        this.display = display;
        this.winery = winery;
        controller = new WineryController(winery);
        display.draw();
    }

    @SneakyThrows
    private void gameLoop(){
        while (true) {
            display.update();
            Thread.sleep(500);
        }
    }

    private void stepByStepLoop(){
        display.update();
        drawMenu();

        controller.execute(getACommand());
    }

    private void drawMenu() {
        System.out.print("Manage your winery | Statistics: \t");
        System.out.print(" vineyards: " + 10 + "\t");
        System.out.print(" total area: " + 99);
        System.out.println();
        System.out.println("[b]uy a new vineyard\t" + "[s]ell a vineyards\t" + " [m]anage you vineyards");
        System.out.println("[t]o collect grapes\t   " + " to make [w]ine\t\t" + " s[e]ll wine");
        System.out.println("[n]ext turn");
    }

    private String getACommand(){
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        return command;
    }

    public void startGame(String mode) {
        if (mode.equals("step by step")){
            stepByStepLoop();
        } else {
            gameLoop();
        }
    }
}
