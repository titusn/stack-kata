package com.titusnachbauer.stack;

public class Stack {
    private int count = 0;

    public boolean isEmpty() {
        return (count == 0);
    }

    public void push(int i) {
        count++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new Underflow();
        }
        count--;
        return 1;
    }
}
