package ru.testerdev.task6;

import com.google.common.collect.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Multiset<String> input = HashMultiset.create();

        Scanner sc = new Scanner(System.in);

        int size = 0;
        System.out.print("Сколько слов вводим - ");

        while (!sc.hasNextInt()) {
            System.out.print("Сколько слов вводим - ");
            sc.next();
        }
        size = sc.nextInt();

        for(int i = 0; i < size; i++) {
            System.out.print(i+1+" - ");
            String word = sc.next();
            input.add(word);
        }
        show(input);
        show(guavaSort(input));
    }

    private static void show(Multiset<String> input) {
        for(String word : input) {
            System.out.print(word+", ");
        }
        System.out.println("");
    }


    public static Multiset<String> guavaSort(Multiset<String> arrWords) {
        //System.out.println(arrWords);

        Multiset<String> output = TreeMultiset.create((obj1, obj2) -> obj1.toLowerCase().compareTo(obj2.toLowerCase()));
        output.addAll(arrWords);
        System.out.println(output);

        return output;
    }

}
