package ru.testerdev.task22;

import ru.testerdev.task22.model.House;
import ru.testerdev.task22.sort.BundleSort;

public class Main {

    public static void main(String[] args) {
        House[] houses = new House[3];
        houses[0] = new House(100, 120000, "Tokyo", true);
        houses[1] = new House(40, 70000, "Oxford", true);
        houses[2] = new House(70, 180000, "Paris", false);
        System.out.println("Initial elements");
        for (House house : houses) {
            System.out.println(house.toString());
        }

        BundleSort<House> sort = new BundleSort<>();
        sort.sort(houses);

        System.out.println("before sort elements");
        for (House house : houses) {
            System.out.println(house.toString());
        }
    }

}
