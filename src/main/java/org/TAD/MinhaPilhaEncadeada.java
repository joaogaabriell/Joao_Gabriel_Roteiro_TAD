package org.TAD;

public class MinhaPilhaEncadeada {
    private Node top;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (size == 0) {
            throw new RuntimeException("Pilha vazia");
        }
        int element = top.data;
        top = top.next;
        size--;
        return element;
    }

    public int size() {
        return size;
    }
}