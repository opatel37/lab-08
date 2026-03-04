package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    /**
     * This test the addCity method in CityList
     * Taken from lab 06
     */
    @Test
    public void testAddCity() {
        CustomList customList = new CustomList();

        assertEquals(0, customList.getCities().size());

        City city = new City("Edmonton", "Alberta");
        customList.addCity(city);

        assertEquals(1, customList.getCities().size());
        assertTrue(customList.getCities().contains(city));
    }

    /**
     * This test the deleteCity method
     * Taken from lab 06
     */
    @Test
    void testDeleteCity() {
        CustomList cityList = new CustomList();

        City city = new City("Test", "Subject");
        cityList.addCity(city);

        cityList.deleteCity(city);
        assertFalse(cityList.getCities().contains(city));
    }

    /**
     * This tests the countCities method
     * Taken from lab 06
     */
    @Test
    void testCountCities() {
        CustomList cityList = new CustomList();

        assertEquals(0, cityList.countCities());

        City city = new City("Test", "Subject");
        cityList.addCity(city);

        assertEquals(1, cityList.countCities());
    }
}
