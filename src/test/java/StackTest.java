import com.titusnachbauer.stack.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void NewStackShouldBeEmpty() {
        Stack stack = new Stack();
        Assertions.assertTrue(stack.isEmpty());
    }
}
