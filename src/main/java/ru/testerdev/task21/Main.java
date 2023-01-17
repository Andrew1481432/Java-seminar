package ru.testerdev.task21;

import ru.testerdev.task21.model.House;
import ru.testerdev.task21.search.BinarySearch;
import ru.testerdev.task21.search.Search;

public class Main {

    public static void main(String[] args) {
        testWithHouseObj();
    }
    private static void testWithHouseObj() {
        House[] houses = new House[3];
        houses[0] = new House(100, 120000, "Tokyo", true);
        houses[1] = new House(40, 70000, "Oxford", true);
        houses[2] = new House(70, 180000, "Paris", false);
        System.out.println("Initial elements");
        for (House house : houses) {
            System.out.println(house.toString());
        }

        System.out.println("Search House use algorithm BinarySearch");
        House targetHouse = new House(40, -1, "NN", false);
        Search<House> search = new BinarySearch<>();
        House findFromArray = search.search(houses, targetHouse);
        System.out.println(findFromArray.toString());
    }

}
