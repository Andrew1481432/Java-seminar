package ru.testerdev.task22.sort;

public abstract class Sort<T extends Comparable<T>> {

    abstract public void sort(T[] arr);

    protected final void swap(T[] arr, int selIEl, int nextIEl) {
        T selEl = arr[selIEl];
        arr[selIEl] = arr[nextIEl];
        arr[nextIEl] = selEl;
    }

}
