package ru.testerdev.task22.sort;

// сортировка пузырьком
public class BundleSort<T extends Comparable<T>> extends Sort<T>{

    @Override
    public void sort(T[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                T arrSel = arr[j];
                T arrNext = arr[j+1];
                if(arrSel.compareTo(arrNext) > 0) {
                    this.swap(arr, j, j+1);
                }
            }
        }
    }

}
