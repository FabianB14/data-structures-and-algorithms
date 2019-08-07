package code401challenges;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    
    int[] toBeReversed = new int []{1,2,3,4,5};
    System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  }

  public static int[] reverseArray(int[] arr) {
    int front = 0;
    int back = arr.length-1;
   while(front < back){
     int temp = arr[front];
     arr[front] = arr[back];
     arr[back] = temp;
     front++;
     back--;
   }
    return arr;
  }
}