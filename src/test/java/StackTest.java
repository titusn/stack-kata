import com.titusnachbauer.stack.Stack;
import com.titusnachbauer.stack.Underflow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack = new Stack();

    @Test
    public void NewStackShouldBeEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterPushStackShouldNotBeEmpty() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterPushAndPopStackShouldBeEmpty() {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void popOnEmptyStackShouldThrowUnderflow() {
        assertThrows(
                Underflow.class,
                () -> stack.pop());
    }

    @Test
    public void afterTwoPushesAndOnePopStackShouldNotBeEmpty() {
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterPushingXStackShouldPopX(){
        stack.push(15);
        assertEquals(15, stack.pop());
        stack.push(1978);
        assertEquals(1978, stack.pop());
    }

    @Test
    public void afterPushingXThenYShouldPopYThenX(){
        stack.push(69);
        stack.push(55);
        assertEquals(55, stack.pop());
        assertEquals(69, stack.pop());
    }

    @Test
    public void afterInitalizationToSizeOneStackShouldAllowToPushOneValue() {
        stack = new Stack(1);
        stack.push(119);
        assertEquals(119, stack.pop());
    }

    @Test
    public void afterInitializationToSizeOneStackShouldAllowToPushTwoValues() {
        stack = new Stack(1);
        stack.push(119);
        stack.push(120);
        assertEquals(120, stack.pop());
        assertEquals(119, stack.pop());
    }
}
