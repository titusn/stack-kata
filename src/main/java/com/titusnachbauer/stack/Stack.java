package com.titusnachbauer.stack;

public class Stack {
    private int count = 0;
    private int value;
    private int[] values;

    Stack(int size) {
        this.values = new int[size];
    }

    Stack() {
        this(2);
    }

    int size() {
        return values.length;
    }
    
    boolean isEmpty() {
        return count == 0;
    }

    int pop() {
        if (isEmpty()) {
            throw new Underflow();        
        }
        count--;
        return values[count];
    }

    void push(int value) {
        if (count == values.length) {
            throw new Overflow();
        } 
        this.values[count] = value;
        count++;  
    }

}
