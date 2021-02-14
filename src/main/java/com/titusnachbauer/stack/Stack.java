package com.titusnachbauer.stack;

public class Stack {
    private static final int DEFAULT_SIZE = 2;

    private int count = 0;
    private int[] elements;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        elements = new int[size] ;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public void push(int element) {
        if (stackAtMaximumCapacity()) {
            increaseCapacity();
        }
        addElement(element);
    }

    private void increaseCapacity() {
        int[] newArray = new int[count + 1];
        System.arraycopy(elements, 0, newArray, 0, count);
        elements = newArray;
    }

    private boolean stackAtMaximumCapacity() {
        return count == elements.length;
    }

    private void addElement(int element) {
        this.elements[count] = element;
        count++;
    }
    public int pop() {
        if (isEmpty()) {
            throw new Underflow();
        }
        return lastElement();
    }

    private int lastElement() {
        return elements[--count];
    }
}
