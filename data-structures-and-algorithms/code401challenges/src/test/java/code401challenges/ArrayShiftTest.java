package code401challenges;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void arrayShift() {
        int[] arr2 = new int[]{1,2,3,5,6};
        int[] arr = new int[]{1,2,4,5};
        int[] expectedArr = new int[]{1,2,3,4,5};
        int num2 = 4;
        int num = 3;
        ArrayShift testArrayShift = new ArrayShift();
        assertArrayEquals("testing an array ", new int[]{1,2,3,4,5}, testArrayShift.arrayShift(new int[]{1,2,4,5},num));
    }
}