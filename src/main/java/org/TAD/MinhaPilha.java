package org.TAD;

import java.util.Arrays;
public class MinhaPilha {
    private int[] array;
    private int top;

    public MinhaPilha(int capacity) {
        array = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == array.length - 1) {
            array = Arrays.copyOf(array, top * 2);
        }
        array[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Pilha vazia");
        }
        return array[top--];
    }

    public int size() {
        return top + 1;
    }
}