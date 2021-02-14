package com.titusnachbauer.stack;

public class Stack {
    private int count = 0;
    private int[] elements = new int[2] ;

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
