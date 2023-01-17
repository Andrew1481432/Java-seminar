package ru.testerdev.task21.search;

public class BinarySearch<T extends Comparable<T>> extends Search<T>{

    @Override
    public T search(T[] arr, T target) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid].compareTo(target) < 0) {
                min = mid + 1;
            } else if (arr[mid].compareTo(target) > 0) {
                max = mid - 1;
            } else {
                return arr[mid]; // target found
            }
        }

        return arr[-(min + 1)]; // target not found
    }

}
