package com.kolll.core.winery.controllers.winerycommands;

import com.kolll.handler.ConsoleHandler;

public class BuyNewVineyard implements WineryCommand {

    @Override
    public void execute() {
        System.out.println("in buy vineyards menu");

        System.out.println("select size new vineyard / выберете размер нового виноградника");

        String  sizeVineyard = ConsoleHandler.getCommnand();


        System.out.println("choose a grape variety / выберете сорт винограда");

        System.out.println("(1)CabernetSauvignon\t" + "(2)Carmenere\t" + "(3)Grenache\n" +
                           "(4)Malbec\t" + "(5)Merlot\t" + "(6)Nebbiolo\n" +
                           "(7)Pinotage\t" + "(8)PinotGrigio\t" + "(9)PinotNoir\n" +
                           "(10)Primitivo\t" + "(11)Shiraz\t" + "(12)Tempranillo\n" +
                           "(13)Zinfandel");

        String  grapeVariety = ConsoleHandler.getCommnand();


        System.out.println("select the landing density / выберите плотность посадки");

        //  output a table of yield from planting density
        //  вывести таблицу урожайности от плотности посадки
        String  landingDensity = ConsoleHandler.getCommnand();

        //send data about the created vineyard to the database
    }
}
