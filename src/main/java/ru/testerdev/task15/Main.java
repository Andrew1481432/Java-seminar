package ru.testerdev.task15;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initial stack:");
        var stack = get10RandomNums();

        Stack<Integer> cloned = (Stack<Integer>) stack.clone();
        while (!cloned.isEmpty()) {
            System.out.printf("elem: %d\n", cloned.pop());
        }

        stack = splitStack(stack);
        System.out.println("Processed stack:");

        while (!stack.isEmpty()) {
            System.out.printf("elem: %d\n", stack.pop());
        }
    }

    /**
     * @return
     */
    public static Stack<Integer> splitStack(Stack<Integer> stack) {
        Queue<Integer> positiveNumber = new LinkedList<>();

        int i = 0;
        while(stack.size() > i) {
            Integer el = stack.elementAt(i);
            if(el > -1) { // числа положительные :) с нулем хз, что делать
                stack.removeElementAt(i);
                positiveNumber.add(el);

                i -= 1;
            }
            i++;
        }

/*        System.out.println("debug negative stack:");
        Stack<Integer> cloned = (Stack<Integer>) stack.clone();
        while (!cloned.isEmpty()) {
            System.out.printf("elem: %d\n", cloned.pop());
        }*/

        while (!positiveNumber.isEmpty()) {
            stack.push(positiveNumber.remove());
        }

        return stack;
    }

    public static Stack<Integer> get10RandomNums() {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            s.push(r.nextInt() % 10);
        }
        return s;
    }

}
