package ru.testerdev.task7.list;

public class ListNode {

    public int data;

    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode next) {
        this(data);
        this.next = next;
    }

}
