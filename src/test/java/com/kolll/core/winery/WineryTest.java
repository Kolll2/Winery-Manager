package com.kolll.core.winery;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A special test case")
class WineryTest {

    private Winery winery = new Winery("TestName");

    @Test
    @DisplayName("# Winery -> getName ->")
    void getName() {
        assertEquals(winery.getName() , "TestName");
    }

    @Test
    @DisplayName("# Winery -> setName ->")
    void setName() {
        winery.setName("NewTestName");
        assertNotEquals(winery.getName(),"TestName");
        assertEquals(winery.getName(),"NewTestName");
    }

    @Test
    @DisplayName("# Winery -> toString ->")
    void testToString() {
        assertEquals(winery.toString(),"Winery{name='TestName'}");
    }
}