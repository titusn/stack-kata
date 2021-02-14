import com.titusnachbauer.stack.Stack;
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
}
