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

    @Test
    public void testAddCity() {
        CustomList customList = new CustomList();

        assertEquals(0, customList.getCities().size());

        City city = new City("Edmonton", "Alberta");
        customList.addCity(city);

        assertEquals(1, customList.getCities().size());
        assertTrue(customList.getCities().contains(city));
    }
}
