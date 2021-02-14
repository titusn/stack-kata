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
    public void AfterPushStackShouldNotBeEmpty() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void AfterPushAndPopStackShouldBeEmpty() {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void PopOnEmptyStackShouldThrowUnderflow() {
        assertThrows(
                Underflow.class,
                () -> stack.pop());
    }

    @Test
    public void AfterTwoPushesAndOnePopStackShouldNotBeEmpty() {
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void AfterPushingXStackShouldPopX(){
        stack.push(15);
        assertEquals(15, stack.pop());
        stack.push(1978);
        assertEquals(1978, stack.pop());
    }

    @Test
    public void AfterPushingXThenYShouldPopYThenX(){
        stack.push(69);
        stack.push(55);
        assertEquals(55, stack.pop());
        assertEquals(69, stack.pop());
    }

    @Test
    public void AfterInitalizationToSizeOneStackShouldAllowToPushOneValue() {
        stack = new Stack(1);
        stack.push(119);
        assertEquals(119, stack.pop());
    }
}
