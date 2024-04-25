package org.TAD; 
public class MeuConjuntoDinamico {
import java.util.Arrays;

public class MeuConjuntoDinamico {
    private int[] array;
    private int size;

    public MeuConjuntoDinamico(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void add(int element) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
        array[size++] = element;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void remove(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                array[i] = array[size - 1];
                size--;
                return;
            }
        }
    }

    public int size() {
        return size;
    }
}}
