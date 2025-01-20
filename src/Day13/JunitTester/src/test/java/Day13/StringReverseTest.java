
package Day13;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringReverseTest {

    private StringReverse stringReverse;

    // Set up the test environment
    @Before
    public void setUp() throws Exception {
        stringReverse = new StringReverse();
    }

    @Test
    public void testReverseWithNormalString() {
        // Test for normal string
        String input = "hello";
        String expected = "olleh";
        assertEquals(expected, stringReverse.reverse(input));
    }

    @Test
    public void testReverseWithEmptyString() {
        // Test for empty string
        String input = "";
        String expected = "";
        assertEquals(expected, stringReverse.reverse(input));
    }

    @Test
    public void testReverseWithSingleCharacter() {
        // Test for a string with a single character
        String input = "a";
        String expected = "a";
        assertEquals(expected, stringReverse.reverse(input));
    }

    @Test
    public void testReverseWithSpecialCharacters() {
        // Test for string with special characters
        String input = "abc#!";
        String expected = "!#cba";
        assertEquals(expected, stringReverse.reverse(input));
    }

    @Test
    public void testReverseWithNullInput() {
        // Test for null input, expecting an exception
        try {
            stringReverse.reverse(null);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Input cannot be null", e.getMessage());
        }
    }
}
