package Day13;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void testValidPalindrome() {
        assertTrue(Palindrome.isPalindrome("madam"));
    }

    @Test
    public void testValidPalindromeWithMixedCase() {
        assertTrue(Palindrome.isPalindrome("RaceCar".toLowerCase()));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testSingleCharacterString() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    public void testNullInput() {
        try {
            Palindrome.isPalindrome(null);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Input cannot be null", e.getMessage());
        }
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertFalse(Palindrome.isPalindrome("nurses run"));
    }

    @Test
    public void testPalindromeWithSpecialCharacters() {
        assertFalse(Palindrome.isPalindrome("A man, a plan, a canal, Panama"));
    }
}
