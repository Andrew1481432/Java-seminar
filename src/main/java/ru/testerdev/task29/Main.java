package ru.testerdev.task29;

import ru.testerdev.task29.exeception.EmptyStackException;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        testStackInt();
    }

    public static Stack<Integer> getRandomNums(int size) {
        Stack<Integer> s = new Stack<>(size);
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            s.push(r.nextInt() % 10);
        }
        return s;
    }

    private static int getRandomDiceNumber() {
        return (int) (Math.random() * 10) + 1;
        // Class Random
    }
    
    private static void testStackInt() {
        final int SIZE = 10;
        Stack<Integer> stack = getRandomNums(SIZE);
        for(int i = 0; i < stack.getSize(); i++) {
            stack.push(getRandomDiceNumber());
        }
        System.out.println("Initial stack:");
        Integer[] arr = stack.toArray(Integer.class);
        for(int i = 0; i < stack.getSize(); i++) {
            System.out.printf("elem: %d\n", arr[i]);
        }

        System.out.println("Processed stack:");
        while (!stack.isEmpty()) {
            try {
                System.out.printf("elem: %d\n", stack.pop());
            } catch (EmptyStackException e) {
                System.out.println("ERROR :: EmptyStackException throw!");
            }
        }
    }

}
