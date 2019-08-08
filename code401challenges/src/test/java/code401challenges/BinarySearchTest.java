package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void TestBinarySearch() {
        BinarySearch binaryTest = new BinarySearch();
        int[] testArr = new int[]{1,3,5,6,8,9,12,14,24,26,27};
        assertEquals("this should return the index", 8, binaryTest.binarySearch(testArr,24));
        assertEquals("this should return the index", 10, binaryTest.binarySearch(testArr,27));
        assertEquals("this should return the index", 2, binaryTest.binarySearch(testArr,5));
        assertEquals("this should return the index", 6, binaryTest.binarySearch(testArr,12));
        assertEquals("this should return the index", -1, binaryTest.binarySearch(testArr,50));
    }
}