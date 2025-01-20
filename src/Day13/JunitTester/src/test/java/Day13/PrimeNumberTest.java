
package Day13;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeNumberTest {

    @Test
    public void testPrimeNumber() {
        assertTrue(PrimeNumber.isPrime(7));
    }

    @Test
    public void testNonPrimeNumber() {
        assertFalse(PrimeNumber.isPrime(10));
    }

    @Test
    public void testPrimeNumberBoundary() {
        assertTrue(PrimeNumber.isPrime(2));
    }

    @Test
    public void testZero() {
        assertFalse(PrimeNumber.isPrime(0));
    }

    @Test
    public void testOne() {
        assertFalse(PrimeNumber.isPrime(1));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(PrimeNumber.isPrime(-5));
    }

    @Test
    public void testLargePrime() {
        assertTrue(PrimeNumber.isPrime(104729));
    }

    @Test
    public void testLargeNonPrime() {
        assertFalse(PrimeNumber.isPrime(100000));
    }
}
