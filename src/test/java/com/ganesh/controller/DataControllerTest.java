package com.ganesh.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @created: 21/09/2021 - 11:10 AM
 * @author: Ganesh
 */

@SpringBootTest
class DataControllerTest {

    @Autowired
    DataController dataController;

    @Test
    @DisplayName("Testing how healthCheck() method works!")
    void healthCheck() {
        assertEquals("HEALTH CHECK OK !", dataController.healthCheck());
    }

    @Test
    @DisplayName("Testing how version() method works!")
    void version() {
        assertEquals( "The actual version is 1.0.0", dataController.version());
    }

    @Test
    @DisplayName("Testing how nationsLenght() method works!")
    void nationsLenght() {
        Integer nationsLength = dataController.getRandomNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    @DisplayName("Testing how currenciesLength() method works")
    void currenciesLength() {
         Integer currenciesLength = dataController.getRandomCurrencies().size();
         assertEquals(20, currenciesLength);
    }
}