package com.titusnachbauer.stack;

public class Stack {
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(int i) {
        isEmpty = false;
    }

    public int pop() {
        isEmpty = true;
        return 1;
    }
}
