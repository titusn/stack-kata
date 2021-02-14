package com.titusnachbauer.stack;

public class Stack {
    private static final int DEFAULT_SIZE = 2;

    private int count = 0;
    private int[] elements = new int[DEFAULT_SIZE] ;

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
