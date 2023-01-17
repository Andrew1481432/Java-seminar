package ru.testerdev.task29;

import ru.testerdev.task29.exeception.EmptyStackException;

import java.lang.reflect.Array;

public class Stack<T>{
    private Object[] arr;
    private int count; //текущее количество элементов в стеке
    private int size; // размер стека

    public Stack(int size) {
        this.size = size;
        arr = new Object[size];
    }

    public boolean push(T element) {
        if(count>=size) return false;
        arr[count++] = element;
        return true;
    }

    // Safe because push(T) is type checked.
    @SuppressWarnings("unchecked")
    private T element(int index) {
        return (T)arr[index];
    }
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException("You try get elememt from empty stack!");
        }
        return element(--count);
    }

    public int getSize() {
        return size;
    }

    /**
     * This HACK METHOD!!!!!! for show all elements
     * @return
     */
    public T[] toArray(Class<T> c) {
        @SuppressWarnings("unchecked")
        final T[] result = (T[]) Array.newInstance(c, count);
        int i = 0;
        for (Object el: arr) {
            result[i] = element(i);
            i++;
        }
        return result;
    }

    public boolean isEmpty() {
        return count == 0;
    }

}
