package com.example.simpleparadox.listycity;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    void testHasCity(){
        list.addCity(new City("Edmonton", "AB"));

        assertTrue(list.hasCity(new City("Edmonton", "AB")));

        City city = new City("Regina", "Saskatchewan");
        assertFalse(list.hasCity(city));
    }
    /*
    @Test
    public void deleteCity(){
        list.addCity(new City("Halifax", "NS"));
        int listSize = list.getCount();

    }*/



}