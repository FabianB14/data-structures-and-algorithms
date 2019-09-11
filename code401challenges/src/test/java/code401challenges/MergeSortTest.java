package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSorter() {
        int[] actual = { 3, 1, 7, 2, 5, 4, 6 };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7 };
        MergeSort.mergeSorter(actual, actual.length);
        assertArrayEquals(expected, actual);

        int[] actual2 = { 4, 1, 3, 2};
        int[] expected2 = { 1, 2, 3, 4 };
        MergeSort.mergeSorter(actual, actual.length);
        assertArrayEquals(expected, actual);
    }
}