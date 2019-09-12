package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort() {
        int[] actual = { 3, 1, 7, 2, 5, 4, 6 };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7 };
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);

        int[] actual2 = { 4, 1, 3, 2};
        int[] expected2 = { 1, 2, 3, 4 };
        QuickSort.quickSort(actual2, 0, actual2.length-1);
        assertArrayEquals(expected2, actual2);
    }
}