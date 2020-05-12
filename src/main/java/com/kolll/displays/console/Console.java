package com.kolll.displays.console;

import com.kolll.displays.Display;

import java.time.LocalDate;
import java.time.Month;

public class Console implements Display {

    //test value
    long money = 2576;
    LocalDate gameDate = LocalDate.of(1725, Month.JANUARY, 1);
    @Override
    public void draw() {

        System.out.println(" Money: " + money + "\t Date: " + gameDate.toString());

    }

    @Override
    public void update() {

    }
}
