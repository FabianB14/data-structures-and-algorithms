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
//    public static void quickSort(int arr[], int begin, int end) {
//        if (begin < end) {
//            int partitionIndex = partition(arr, begin, end);
//
//            quickSort(arr, begin, partitionIndex-1);
//            quickSort(arr, partitionIndex+1, end);
//        }
//    }
//    private static int partition(int arr[], int begin, int end) {
//        int pivot = arr[end];
//        int i = (begin-1);
//
//        for (int j = begin; j < end; j++) {
//            if (arr[j] <= pivot) {
//                i++;
//
//                int swapTemp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = swapTemp;
//            }
//        }
//
//        int swapTemp = arr[i+1];
//        arr[i+1] = arr[end];
//        arr[end] = swapTemp;
//
//        return i+1;
//    }
}