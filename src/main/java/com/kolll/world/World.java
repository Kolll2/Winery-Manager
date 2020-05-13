package com.kolll.world;

import com.kolll.core.winery.Winery;
import com.kolll.core.winery.controllers.WineryController;
import com.kolll.displays.Display;
import com.kolll.displays.console.Console;
import lombok.SneakyThrows;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class World {

    Display display;
    LocalDate gameDate;

    Winery winery;
    WineryController controller;


    public World(Winery winery) {
        this.display = new Console(this);
        this.winery = winery;
        controller = new WineryController(this, winery);
        gameDate = LocalDate.of(1725, Month.JANUARY, 1);
        display.draw();
    }


    @SneakyThrows
    private void gameLoop(){
        while (true) {
            display.update();
            Thread.sleep(500);
            gameDate = gameDate.plusDays(1);
        }
    }

    private void stepByStepLoop(){
        while (controller.isAlive()) {
            display.update();
            drawMenu();

            controller.execute(getACommand());
        }
    }

    private void drawMenu() {
        System.out.print("Manage your winery | Statistics: \t");
        System.out.print(" vineyards: " + 10 + "\t");
        System.out.print(" total area: " + 99);
        System.out.println();
        System.out.println("[b]uy a new vineyard\t" + "[s]ell a vineyards\t" + " [m]anage you vineyards");
        System.out.println("[t]o collect grapes\t   " + " to make [w]ine\t\t" + " s[e]ll wine");
        System.out.println("[n]ext turn \t" + "E[x]it game");
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

    public LocalDate getGameDate() {
        return gameDate;
    }

    public void setGameDate(LocalDate gameDate) {
        this.gameDate = gameDate;
    }
}
