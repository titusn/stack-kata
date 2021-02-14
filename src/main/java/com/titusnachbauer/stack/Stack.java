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
        this.elements[count] = element;
        count++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new Underflow();
        }
        return elements[--count];
    }
}
