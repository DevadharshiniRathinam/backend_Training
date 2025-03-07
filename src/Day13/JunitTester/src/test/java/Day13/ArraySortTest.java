package Day13;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class ArraySortTest {
    private ArraySort arraySort;

    @Before
    public void setUp() throws Exception {
        arraySort = new ArraySort();
    }

    @Test
    public void testSortWithDuplicates() {
        int[] input = {5, 3, 5, 2, 3};
        int[] expected = {2, 3, 3, 5, 5};
        assertArrayEquals(expected, arraySort.sortArray(input));
    }

    @Test
    public void testSortAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arraySort.sortArray(input));
    }

    @Test
    public void testSortEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, arraySort.sortArray(input));
    }

    @Test
    public void testSortSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, arraySort.sortArray(input));
    }

    @Test
    public void testSortUnsortedArray() {
        int[] input = {4, 2, 7, 1, 3};
        int[] expected = {1, 2, 3, 4, 7};
        assertArrayEquals(expected, arraySort.sortArray(input));
    }

    @Test
    public void testSortNullArray() {
        try {
            arraySort.sortArray(null);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Input array cannot be null", e.getMessage());
        }
    }
}
