package com.kolll;

import com.kolll.core.winery.Winery;

public class Main {
    public static void main(String[] args) {
        System.out.println("The Winery Manager has been successfully launched");
        Winery winery = new Winery("New Name");
        System.out.println(winery.toString());
    }
}
