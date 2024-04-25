package org.TAD;

public class MinhaFilaEncadeada {
    private Node head, tail;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Fila vazia");
        }
        int element = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return element;
    }

    public int size() {
        return size;
    }
}