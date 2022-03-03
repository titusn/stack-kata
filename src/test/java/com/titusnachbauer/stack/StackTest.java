package com.titusnachbauer.stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack = new Stack();
    
    @Test
    void NewStackShouldBeEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void PopOnEmptyStackShouldThrowUnderflow() {
        assertThrows (
            Underflow.class,
            () -> stack.pop()
        );
    }

    @Test
    void AfterPushStackShouldNotBeEmpty() {
        stack.push(18);
        assertFalse(stack.isEmpty());
    }

    @Test
    void AfterPushAndPopStackShouldBeEmpty() {
        stack.push(39);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void AfterTwoPushesAndOnePopStackShouldNotBeEmpty() {
        stack.push(110);
        stack.push(17);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    void AfterPushingXShouldPopX() {
        stack.push(323);
        assertEquals(323, stack.pop());
    }

    @Test
    void AfterPushingXThenYShouldPopYThenX() {
        stack.push(28);
        stack.push(99);
        assertEquals(99, stack.pop());
        assertEquals(28, stack.pop());
    }

    @Test
    void WhenInitializingStackCanSetSize() {
        Stack stack = new Stack(2);
        assertEquals(2, stack.size());
    }

    @Test
    void AfterInitializingToSize2ShouldThrowOverflowWhenPushing3Values() {
        stack.push(15);
        stack.push(1);
        assertThrows(
            Overflow.class,
            () -> stack.push(5)
        );
    }
}
