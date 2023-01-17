package ru.testerdev.task7;


import ru.testerdev.task7.list.LinkedIntList;

public class Main {

    public static void main(String[] args) {
        LinkedIntList list1 = new LinkedIntList("list1");
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.show();

        LinkedIntList list2 = new LinkedIntList("list2");
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.show();
        list2.removeAll(list1);
        //list1.removeAll(list2);
        System.out.println("Before delete");
        list1.show();
        list2.show();
    }

}
