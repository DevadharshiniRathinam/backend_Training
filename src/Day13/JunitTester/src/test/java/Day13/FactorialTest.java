package Day13;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testFactorialOfSmallPositiveNumber() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    public void testFactorialOfLargePositiveNumber() {
        assertEquals(479001600, Factorial.factorial(12));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        try {
            Factorial.factorial(-5);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number must be non-negative", e.getMessage());
        }
    }
}
