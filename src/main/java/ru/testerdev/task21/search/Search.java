package ru.testerdev.task21.search;

public abstract class Search<T extends Comparable<T>> {

    abstract public T search(T[] arr, T target);

}
