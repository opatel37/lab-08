package com.example.lab08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Added comment to verify CI on Github
public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) { cities.add(city); }

    /**
     * This deletes the given city from the city list if it exists in the list
     * @param city
     *      This is the city we want to delete
     */
    public void deleteCity(City city) {
        List<City> list = cities;
        if (!list.contains(city)) {
            throw new IllegalArgumentException("City is not in list :(");
        }
        cities.remove(city);
    }

    // Will be implemented later using TDD (leave blank for now)
    // Commeneted out for lab participateion exercise :/
    //public boolean hasCity(City city) { return cities.contains(city); }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

}
