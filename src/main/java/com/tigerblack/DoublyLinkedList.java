package com.tigerblack;

public class DoublyLinkedList<T> {
    private T value;
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    private class Node<T> {
        private T value;
        private Node<T> previous;
        private Node<T> next;
        public Node(T value, Node next, Node previous) {
          this.value = value;
          this.next = next;
          this.previous = previous;
        }

        public T getValue() {
            return value;
        }
    }

    public int size() { return size;}
    public boolean isEmpty() { return size == 0;}

    public void append(T value) {
        Node temp = new Node(value, null, tail);
        if (tail != null) {
            tail.next = temp;
        }
        tail = temp;
        if (head == null) { head = temp;}
        size++;
        System.out.println(value);
    }
    public void prepend(T value) {
        Node temp = new Node(value, head, null);
        if (head != null) {
            head.previous = temp;
        }
        head = temp;
        size++;
        System.out.println(value);
    }
    public void iterate() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.next;
        }
    }
    public T head() {
        if (head == null) {
            return null;
        }
        return head.getValue();

    }
    public T tail() {
        if (tail == null) {
            return null;
        }
        return tail.getValue();
    }

}
