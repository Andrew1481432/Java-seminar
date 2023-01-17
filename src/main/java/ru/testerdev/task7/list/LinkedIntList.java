package ru.testerdev.task7.list;

public class LinkedIntList {

    private String name;
    private ListNode front;

    public LinkedIntList(String name) {
        this.name = name;
        this.front = null;
    }

    public void add(int data) {
        if(front == null) {
            front = new ListNode(data);
            return;
        }

        ListNode select = front;
        while(select.next != null) {
            select = select.next;
        }

        select.next = new ListNode(data);
    }

    public void show() {
        System.out.print(name+": [");

        ListNode select = front;
        while(select != null) {
            System.out.print(select.data);
            if(select.next != null) {
                System.out.print(", ");
            }
            select = select.next;
        }
        System.out.println("]");
    }

    public void deleteElement(int element) {
        // region front
        boolean running = true;
        while(running) {
            if(front == null) {
                running = false;
                return;
            }

            if(front.data == element) {
                front = front.next;
            } else {
                running = false;
            }
        }
        // endregion

        ListNode prev = front;
        ListNode next = null;
        running = true;
        while(running) {
            if(prev == null) {
                running = false;
                return;
            }
            next = prev.next;
            if(next == null) {
                running = false;
                return;
            }


            if(next.data == element) {
                prev.next = next.next;
                prev = next.next;
            } else {
                prev = next;
            }
        }
    }

    public void removeAll(LinkedIntList list) {
        ListNode select = list.front;
        while(select != null) {
            this.deleteElement(select.data);
            select = select.next;
        }
    }

}
