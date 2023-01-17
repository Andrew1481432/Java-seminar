package ru.testerdev.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int getRandomDiceNumber() {
        return getRandom(1, 10);
    }
    private static int getRandom(int min, int max) {
        return (int) (Math.random() * max) + min;
        // Class Random
    }

    public static void main(String[] args) {
        final int SIZE = 10;
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < SIZE; i++) {
            list1.add(getRandomDiceNumber());
        }
        show(list1, "list1");
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < getRandom(5, SIZE); i++) {
            list2.add(getRandomDiceNumber());
        }
        show(list2, "list2");

        List<Integer> result = altmate(list1, list2);
        show(result, "result(list1+list2)");
    }

    private static void show(List<Integer> list, String name) {
        System.out.println("Show elements with name " + name);
        int i = 0;
        for(Integer el: list) {
            System.out.print(el);
            if(i++ != list.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    public static List<Integer> altmate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int lenList1 = list1.size();
        int lenList2 = list2.size();
        int maxLen = Math.max(lenList1, lenList2);
        for(int i = 0; i < maxLen; i++) {
            if(lenList1>i) {
                result.add(list1.get(i));
            }
            if(lenList2>i) {
                result.add(list2.get(i));
            }
        }
        return result;
    }


}
