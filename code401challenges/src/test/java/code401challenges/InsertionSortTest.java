package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSort() {
        int[] input = {6, 2, 3, 7, 4, 8, 5, 1};
        InsertionSort.insertionSort(input);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals("the arrays should be equal", expected, input);
    }
}