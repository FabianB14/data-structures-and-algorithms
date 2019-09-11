package code401challenges;

public class QuickSort {
    public static int[] quickSort(int[] arr,int left, int right){
        if(left  <  right){
        int separatedIndex = separation(arr,left,right);

        quickSort(arr, left, separatedIndex -1);
        quickSort(arr, separatedIndex +1, right);
        }
        return arr;
    }

    public static int separation(int[] arr, int left , int right){
        int holder = arr[right];
        int iterator = (left - 1);
        for(int j = left; j < right; j++){
            if(arr[j] <= holder){
                iterator++;

                int temp = arr[iterator];
                arr[iterator] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[iterator + 1];
        arr[iterator + 1] = arr[right];
        arr[right] = temp;

        return iterator +1;
    }
}