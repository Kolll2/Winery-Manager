package com.kolll.displays.console;

import org.junit.jupiter.api.Test;

class ConsoleTest {
    //Field gameDate of type LocalDate - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    Console console = new Console();

    @Test
    void testDraw() {
        console.draw();
    }

    @Test
    void testUpdate() {
        console.update();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme