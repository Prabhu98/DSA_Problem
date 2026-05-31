package org.example;

import java.util.Arrays;

public class ArrayImplementation {

    private int[] arr;
    private int size;
    private final int capacity;

    public ArrayImplementation(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    // Validate index for insert
    private void validateInsertIndex(int index) {
        if (index < 0 || index > size || size >= capacity) {
            throw new IndexOutOfBoundsException("Invalid index for insert: " + index);
        }
    }

    // Validate index for access/update/delete
    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public boolean insert(int index, int element) {
        validateInsertIndex(index);
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        size++;
        return true;
    }

    public boolean delete(int index) {
        validateIndex(index);
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return true;
    }

    public int get(int index) {
        validateIndex(index);
        return arr[index];
    }

    public void set(int index, int element) {
        validateIndex(index);
        arr[index] = element;
    }

    public int search(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // not found
    }

    public void display() {
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, size)));
    }

    public static void main(String[] args) {
        ArrayImplementation a1 = new ArrayImplementation(4);

        a1.insert(0, 4);
        a1.insert(1, 2);
        a1.insert(2, 3);
        a1.insert(2, 60);

        a1.display(); // [4, 2, 60, 3]

        a1.delete(1);
        a1.display(); // [4, 60, 3]

        a1.set(1, 20);
        System.out.println("Element at index 1: " + a1.get(1)); // 20

        int idx = a1.search(3);
        System.out.println("Index of 3: " + idx); // 2
    }
}
