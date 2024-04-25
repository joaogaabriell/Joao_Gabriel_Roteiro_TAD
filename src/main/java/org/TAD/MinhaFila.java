package org.TAD;

import java.util.Arrays;
public class MinhaFila {
    private int[] array;
    private int front;
    private int rear;
    private int size;

    public MinhaFila(int capacity) {
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
        rear = (rear + 1) % array.length;
        array[rear] = element;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Fila vazia");
        }
        int element = array[front];
        front = (front + 1) % array.length;
        size--;
        return element;
    }

    public int size() {
        return size;
    }
}
